package com.mycompany.hrkapp6fe.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.LazyDataModel;
import com.mycompany.hrkapp6fe.dto.CustomersDTO;
import com.mycompany.hrkapp6fe.model.CustomerLazyDataModel;

@ManagedBean
@ViewScoped
public class CustomerBean {
	
	CustomerLazyDataModel dataModel = new CustomerLazyDataModel();
	
	private CustomersDTO selectedCustomer;
	
    public LazyDataModel<CustomersDTO> getModel(){
        return dataModel;
    }

	public CustomersDTO getSelectedCustomer() {
		return selectedCustomer;
	}

	public void setSelectedCustomer(CustomersDTO selectedCustomer) {
		this.selectedCustomer = selectedCustomer;
	}
    
    

}
