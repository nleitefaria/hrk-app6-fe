package com.mycompany.hrkapp6fe.model;

import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.mycompany.hrkapp6fe.dto.OrdersDTO;
import com.mycompany.hrkapp6fe.service.OrderService;

public class OrderLazyDataModel extends LazyDataModel<OrdersDTO> 
{	
	private static final long serialVersionUID = 551614594141174353L;
	
	public OrderLazyDataModel(){	
		OrderService s = new OrderService();
        this.setRowCount(s.count());
    }
    
    public List<OrdersDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters)
    {
    	OrderService s = new OrderService();
        return s.getAll(first / 10, pageSize);
    }
    
}