package com.mycompany.hrkapp6fe.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class CustomerFormBean {
	
	private String firstname;
    private String lastname;
 
    public String getFirstname() {
        return firstname;
    }
 
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
 
    public String getLastname() {
        return lastname;
    }
 
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
 
    public String save() {
        //FacesContext.getCurrentInstance().addMessage(null,
                //new FacesMessage("Welcome " + firstname + " " + lastname));
        
        System.out.println(firstname);
        System.out.println(lastname);
        
        return "customers?faces-redirect=true"; 
        
    }

}
