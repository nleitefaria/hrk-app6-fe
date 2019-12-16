package com.mycompany.hrkapp6fe.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class CustomerFormBean {
	
	private String firstName;
    private String lastName;
 
    
    public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String save() {
        //FacesContext.getCurrentInstance().addMessage(null,
                //new FacesMessage("Welcome " + firstname + " " + lastname));
        
        System.out.println(firstName);
        System.out.println(lastName);
        
        return "customers?faces-redirect=true"; 
        
    }

}
