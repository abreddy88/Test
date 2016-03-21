package com.bootcamp.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.bootcamp.model.Product;

@WebService
public interface IProductCatalog {

	List<String> getProductCategories();

	List<String> getProducts(String category);

	boolean addProduct(String category, String product);

	List<Product> getProductsv2(String category);

}