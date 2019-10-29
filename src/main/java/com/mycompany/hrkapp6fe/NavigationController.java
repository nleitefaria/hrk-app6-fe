package com.mycompany.hrkapp6fe;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigation")
@RequestScoped
public class NavigationController {
	
	public String listProducts(){
	    return "products?faces-redirect=true";
	}
	
	public String listCustomers(){
	    return "customers?faces-redirect=true"; 
	}
	
	public String listCars(){
	    return "cars?faces-redirect=true"; 
	}
	
	public String listCustomers1(){
	    return "customers1?faces-redirect=true"; 
	}

}
