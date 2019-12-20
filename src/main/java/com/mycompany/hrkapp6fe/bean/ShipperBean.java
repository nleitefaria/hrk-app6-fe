package com.mycompany.hrkapp6fe.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.LazyDataModel;
import com.mycompany.hrkapp6fe.dto.ShippersDTO;
import com.mycompany.hrkapp6fe.model.ShipperLazyDataModel;

@ManagedBean
@ViewScoped
public class ShipperBean {
	
	ShipperLazyDataModel dataModel = new ShipperLazyDataModel();
	
	private ShippersDTO selectedShipper;

    public LazyDataModel<ShippersDTO> getModel(){
        return dataModel;
    }

	public ShippersDTO getSelectedShipper() {
		return selectedShipper;
	}

	public void setSelectedShipper(ShippersDTO selectedShipper) {
		this.selectedShipper = selectedShipper;
	}
    
    

}
