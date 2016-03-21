package com.bootcamp.webservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.bootcamp.model.Product;
import com.bootcamp.service.ProductServiceImpl;

@WebService(endpointInterface="com.bootcamp.webservice.IProductCatalog")
public class ProductCatalog implements IProductCatalog {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see com.bootcamp.webservice.IProductCatalog#getProductCategories()
	 */
	@Override
	
	public List<String> getProductCategories(){		
		return productService.getProductCategories();
	}
	
	/* (non-Javadoc)
	 * @see com.bootcamp.webservice.IProductCatalog#getProducts(java.lang.String)
	 */
	@Override

	public List<String> getProducts(String category){
		return productService.getProducts(category);	
	}
	
	/* (non-Javadoc)
	 * @see com.bootcamp.webservice.IProductCatalog#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	
	public boolean addProduct(String category,String product){
		return productService.addProduct(category, product);
	}
	
	/* (non-Javadoc)
	 * @see com.bootcamp.webservice.IProductCatalog#getProductsv2(java.lang.String)
	 */
	@Override

	public List<Product> getProductsv2(String category){
		return productService.getProductsv2(category);	
	}

}
