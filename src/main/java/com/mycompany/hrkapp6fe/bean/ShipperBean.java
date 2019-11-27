package com.mycompany.hrkapp6fe.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.LazyDataModel;
import com.mycompany.hrkapp6fe.dto.ShippersDTO;
import com.mycompany.hrkapp6fe.model.ShipperLazyDataModel;

@ManagedBean
@RequestScoped
public class ShipperBean {
	
	ShipperLazyDataModel dataModel = new ShipperLazyDataModel();

    public LazyDataModel<ShippersDTO> getModel(){
        return dataModel;
    }

}
