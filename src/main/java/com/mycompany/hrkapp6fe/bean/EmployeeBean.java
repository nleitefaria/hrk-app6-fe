package com.mycompany.hrkapp6fe.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.LazyDataModel;
import com.mycompany.hrkapp6fe.dto.EmployeesDTO;
import com.mycompany.hrkapp6fe.model.EmployeeLazyDataModel;

@ManagedBean
@ViewScoped
public class EmployeeBean {
	
	EmployeeLazyDataModel dataModel = new EmployeeLazyDataModel();
	
	private EmployeesDTO selectedEmployee;

    public LazyDataModel<EmployeesDTO> getModel(){
        return dataModel;
    }

	public EmployeesDTO getSelectedEmployee() {
		return selectedEmployee;
	}

	public void setSelectedEmployee(EmployeesDTO selectedEmployee) {
		this.selectedEmployee = selectedEmployee;
	}
}
