package com.mycompany.hrkapp6fe.model;

import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.mycompany.hrkapp6fe.dto.CustomersDTO;
import com.mycompany.hrkapp6fe.service.CustomerService;


public class CustomerLazyDataModel extends LazyDataModel<CustomersDTO> 
{	
	private static final long serialVersionUID = 551614594141174353L;
	
	public CustomerLazyDataModel(){	
		CustomerService s = new CustomerService();
        this.setRowCount(s.count());
    }
    
    public List<CustomersDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters)
    {
    	CustomerService s = new CustomerService();
        return s.getAll(first / 10, pageSize);
    }

}
