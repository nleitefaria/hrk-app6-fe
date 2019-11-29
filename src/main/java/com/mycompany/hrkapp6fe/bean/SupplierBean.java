package com.mycompany.hrkapp6fe.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.LazyDataModel;

import com.mycompany.hrkapp6fe.dto.SuppliersDTO;
import com.mycompany.hrkapp6fe.model.SupplierLazyDataModel;

@ManagedBean
@RequestScoped
public class SupplierBean {
	
	SupplierLazyDataModel dataModel = new SupplierLazyDataModel();

    public LazyDataModel<SuppliersDTO> getModel(){
        return dataModel;
    }

}
