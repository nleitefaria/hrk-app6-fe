package com.mycompany.hrkapp6fe.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.LazyDataModel;
import com.mycompany.hrkapp6fe.dto.ProductsDTO;
import com.mycompany.hrkapp6fe.model.ProductLazyDataModel;

@ManagedBean
@ViewScoped
public class ProductBean {

	ProductLazyDataModel dataModel = new ProductLazyDataModel();
	
	private ProductsDTO selectedProduct;

    public LazyDataModel<ProductsDTO> getModel(){
        return dataModel;
    }

	public ProductsDTO getSelectedProduct() {
		return selectedProduct;
	}

	public void setSelectedProduct(ProductsDTO selectedProduct) {
		this.selectedProduct = selectedProduct;
	} 
}
