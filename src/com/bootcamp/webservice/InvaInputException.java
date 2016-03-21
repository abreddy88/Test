package com.bootcamp.webservice;

public class InvaInputException extends Exception {
	
	private String errorDetails;
	
	public InvaInputException(String reason,String errorDetails){
		super(reason);
		this.errorDetails = errorDetails;
	}
	
	public String getFaultInfo(){
		return errorDetails;
	}
	

}
