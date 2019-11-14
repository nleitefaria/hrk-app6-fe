package com.mycompany.hrkapp6fe.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.LazyDataModel;

import com.mycompany.hrkapp6fe.dto.InvoicesDTO;
import com.mycompany.hrkapp6fe.model.InvoiceLazyDataModel;

@ManagedBean
@RequestScoped
public class InvoiceBean {
	
	InvoiceLazyDataModel dataModel = new InvoiceLazyDataModel();

    public LazyDataModel<InvoicesDTO> getModel(){
        return dataModel;
    }

}
