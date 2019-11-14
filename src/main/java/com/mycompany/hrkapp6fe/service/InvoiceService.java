package com.mycompany.hrkapp6fe.service;

import java.util.List;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.mycompany.hrkapp6fe.dto.InvoicesDTO;
import com.mycompany.hrkapp6fe.dto.InvoicesPageDTO;

public class InvoiceService {
	
	
    final String path = "https://hrk-app6.herokuapp.com/api/v1/invoice"; 
	
	public InvoiceService(){}
	
    public List<InvoicesDTO> getAll(int start, int size)
    {  
    	ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(path + "/all/" + (start + 1));
        Response response = target.request().get();
        InvoicesPageDTO value = response.readEntity(InvoicesPageDTO.class);
        response.close();
        return value.getContent();
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
