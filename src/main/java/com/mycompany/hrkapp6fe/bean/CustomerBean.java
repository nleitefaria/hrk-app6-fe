package com.mycompany.hrkapp6fe.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.LazyDataModel;
import com.mycompany.hrkapp6fe.dto.CustomersDTO;
import com.mycompany.hrkapp6fe.model.CustomerLazyDataModel;

@ManagedBean
@RequestScoped
public class CustomerBean {
	
	CustomerLazyDataModel dataModel = new CustomerLazyDataModel();
	
    public LazyDataModel<CustomersDTO> getModel(){
        return dataModel;
    }

}
