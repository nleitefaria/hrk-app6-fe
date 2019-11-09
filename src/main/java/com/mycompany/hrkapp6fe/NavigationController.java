package com.mycompany.hrkapp6fe;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigation")
@RequestScoped
public class NavigationController {
	
	public String home(){
	    return "index?faces-redirect=true";
	}
	
	public String listProducts(){
	    return "products?faces-redirect=true";
	}
	
	public String listCustomers(){
	    return "customers?faces-redirect=true"; 
	}
	
	public String listEmployees(){
	    return "employees?faces-redirect=true"; 
	}
	
	public String listInvoices(){
	    return "invoices?faces-redirect=true"; 
	}
	
	public String listOrders(){
	    return "orders?faces-redirect=true"; 
	}
	
	public String listShippers(){
	    return "shippers?faces-redirect=true"; 
	}
	
	public String listSuppliers(){
	    //return "suppliers?faces-redirect=true";
	    return "index?faces-redirect=true";
	}
}
