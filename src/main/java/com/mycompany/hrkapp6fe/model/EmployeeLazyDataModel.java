package com.mycompany.hrkapp6fe.model;

import java.util.List;
import java.util.Map;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import com.mycompany.hrkapp6fe.dto.EmployeesDTO;
import com.mycompany.hrkapp6fe.service.EmployeeService;

public class EmployeeLazyDataModel extends LazyDataModel<EmployeesDTO>  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6616648323739322184L;

	public EmployeeLazyDataModel(){	
		EmployeeService s = new EmployeeService();
        this.setRowCount(s.count());
    }
    
    public List<EmployeesDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters)
    {
    	EmployeeService s = new EmployeeService();
        return s.getAll(first / 10, pageSize);
    }
	
	

}
