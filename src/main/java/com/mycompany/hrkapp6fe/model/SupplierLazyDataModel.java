package com.mycompany.hrkapp6fe.model;

import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.mycompany.hrkapp6fe.dto.SuppliersDTO;
import com.mycompany.hrkapp6fe.service.SupplierService;

public class SupplierLazyDataModel extends LazyDataModel<SuppliersDTO> 
{	
	private static final long serialVersionUID = 551614594141174353L;
	
	public SupplierLazyDataModel(){	
		SupplierService s = new SupplierService();
        this.setRowCount(s.count());
    }
    
    public List<SuppliersDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters)
    {
    	SupplierService s = new SupplierService();
        return s.getAll(first / 10, pageSize);
    }

}