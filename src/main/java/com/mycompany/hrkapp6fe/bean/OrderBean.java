package com.mycompany.hrkapp6fe.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.LazyDataModel;

import com.mycompany.hrkapp6fe.dto.OrdersDTO;
import com.mycompany.hrkapp6fe.model.OrderLazyDataModel;

@ManagedBean
@ViewScoped
public class OrderBean {
	
	OrderLazyDataModel dataModel = new OrderLazyDataModel();
	
	private OrdersDTO selectedOrder;

    public LazyDataModel<OrdersDTO> getModel(){
        return dataModel;
    }

	public OrdersDTO getSelectedOrder() {
		return selectedOrder;
	}

	public void setSelectedOrder(OrdersDTO selectedOrder) {
		this.selectedOrder = selectedOrder;
	}
}
