package com.bootcamp.model;

//This is a model class

public class Product {
	
	private String name;
	private String sku;
	private String price;
	
	public Product(){
		
	}
	
	public Product(String name,String sku,String price) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.sku = sku;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	

}
