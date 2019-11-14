package com.mycompany.hrkapp6fe.model;

import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.mycompany.hrkapp6fe.dto.InvoicesDTO;
import com.mycompany.hrkapp6fe.service.InvoiceService;

public class InvoiceLazyDataModel  extends LazyDataModel<InvoicesDTO> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8331119169157199311L;

	public InvoiceLazyDataModel(){	
		InvoiceService s = new InvoiceService();
        this.setRowCount(s.count());
    }
    
    public List<InvoicesDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters)
    {
    	InvoiceService s = new InvoiceService();
        return s.getAll(first / 10, pageSize);
    }

}
