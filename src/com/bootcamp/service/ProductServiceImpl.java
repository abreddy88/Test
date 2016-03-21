package com.bootcamp.service;

import java.util.ArrayList;
import java.util.List;

import com.bootcamp.model.Product;

public class ProductServiceImpl {
	
	List<String> Books = new ArrayList<String>();
	List<String> Music = new ArrayList<String>();
	List<String> Movies = new ArrayList<String>();
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
		Books.add("book1");
		Books.add("book2");
		Books.add("book3");
		
		Music.add("music1");
		Music.add("music2");
		Music.add("music3");
		
		Movies.add("movie1");
		Movies.add("movie2");		
		Movies.add("movie3");		
	}
	
	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		
		return categories;		
	}
	 
	public List<String> getProducts(String category){
		switch(category){
		case "books":
			return Books;
		case "music":
			return Music;
		case "movie":
		  return Movies;
		
		}
		return null;
		
	}
	
	public boolean addProduct(String category,String product){
		
		switch(category){
		case "books":
			Books.add(product);
			break;
			
		case "music":
			Music.add(product);
			break;
			
		case "movie":
			Movies.add(product);
			break;
			
			default :
				return false;
		
		}
		
		return true;
		
	}

	public List<Product> getProductsv2(String category) {
		// TODO Auto-generated method stub
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Java","1234","9999.99"));
		productList.add(new Product("Java2","123444","9.99"));
		return productList;
	}
	

}
