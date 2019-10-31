package com.mycompany.hrkapp6fe.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.LazyDataModel;

import com.mycompany.hrkapp6fe.dto.CustomersDTO;
import com.mycompany.hrkapp6fe.dto.EmployeesDTO;
import com.mycompany.hrkapp6fe.model.CustomerLazyDataModel;
import com.mycompany.hrkapp6fe.model.EmployeeLazyDataModel;

@ManagedBean
@RequestScoped
public class EmployeeBean {
	
	EmployeeLazyDataModel dataModel = new EmployeeLazyDataModel();

    public LazyDataModel<EmployeesDTO> getModel(){
        return dataModel;
    }

}
