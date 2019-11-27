package com.mycompany.hrkapp6fe.model;

import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.mycompany.hrkapp6fe.dto.ShippersDTO;
import com.mycompany.hrkapp6fe.service.ShipperService;

public class ShipperLazyDataModel extends LazyDataModel<ShippersDTO>{
	
	private static final long serialVersionUID = 1L;

	public ShipperLazyDataModel(){	
		ShipperService s = new ShipperService();
        this.setRowCount(s.count());
    }
    
    public List<ShippersDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters)
    {
    	ShipperService s = new ShipperService();
        return s.getAll(first / 10, pageSize);
    }


}
