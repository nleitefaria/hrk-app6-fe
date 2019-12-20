package com.mycompany.hrkapp6fe.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.LazyDataModel;

import com.mycompany.hrkapp6fe.dto.SuppliersDTO;
import com.mycompany.hrkapp6fe.model.SupplierLazyDataModel;

@ManagedBean
@ViewScoped
public class SupplierBean {
	
	SupplierLazyDataModel dataModel = new SupplierLazyDataModel();
	
	private SuppliersDTO selectedSupplier;

    public LazyDataModel<SuppliersDTO> getModel(){
        return dataModel;
    }

	public SuppliersDTO getSelectedSupplier() {
		return selectedSupplier;
	}

	public void setSelectedSupplier(SuppliersDTO selectedSupplier) {
		this.selectedSupplier = selectedSupplier;
	}
}
