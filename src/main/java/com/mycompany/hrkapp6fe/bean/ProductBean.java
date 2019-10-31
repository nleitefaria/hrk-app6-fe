package com.mycompany.hrkapp6fe.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.LazyDataModel;

import com.mycompany.hrkapp6fe.dto.ProductsDTO;
import com.mycompany.hrkapp6fe.model.ProductLazyDataModel;

@ManagedBean
@RequestScoped
public class ProductBean {
	
	
	
	ProductLazyDataModel dataModel = new ProductLazyDataModel();

    public LazyDataModel<ProductsDTO> getModel(){
        return dataModel;
    }
    
    

}
