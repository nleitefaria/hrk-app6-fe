package com.mycompany.hrkapp6fe.service;

import java.util.List;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.apache.http.HttpResponse;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.mycompany.hrkapp6fe.dto.CustomersDTO;
import com.mycompany.hrkapp6fe.dto.CustomersPageDTO;

public class CustomerService {
	
	final String path = "https://hrk-app6.herokuapp.com/api/v1/customer"; 
	
	public CustomerService(){}
	
    public List<CustomersDTO> getAll(int start, int size)
    {  
    	ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(path + "/all/" + (start + 1));
        Response response = target.request().get();
        CustomersPageDTO value = response.readEntity(CustomersPageDTO.class);
        response.close();
        return value.getContent();
    }
    
    public void create(CustomersDTO customerDTO)
    {
    	
    	
    	try {
            ResteasyClient client = new ResteasyClientBuilder().build();
 
            ResteasyWebTarget target = client.target(path + "/");
 
            Response response = target.request().post(Entity.entity(customerDTO, "application/json"));
 
//            if (response.getStatus() != 200) {
//                throw new RuntimeException("Failed : HTTP error code : "
//                        + response.getStatus());
//            }
            
            System.out.println("--------------> " + response.getStatus());
 
            System.out.println("Server response : \n");
            System.out.println(response.readEntity(String.class));
 
            response.close();
 
        } catch (Exception e) {
 
            e.printStackTrace();
 
        }
    	 
    	 
    	 
    	
    }

    public int count()
    {
    	ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(path + "/count");
        Response response = target.request().get();
        Long value = response.readEntity(Long.class);       
        response.close();
        return value.intValue();
    }
    
    
    
     
    
}