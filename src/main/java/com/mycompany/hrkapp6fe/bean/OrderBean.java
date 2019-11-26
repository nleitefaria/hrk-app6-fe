package com.mycompany.hrkapp6fe.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.LazyDataModel;

import com.mycompany.hrkapp6fe.dto.OrdersDTO;
import com.mycompany.hrkapp6fe.model.OrderLazyDataModel;

@ManagedBean
@RequestScoped
public class OrderBean {
	
	OrderLazyDataModel dataModel = new OrderLazyDataModel();

    public LazyDataModel<OrdersDTO> getModel(){
        return dataModel;
    }

}
