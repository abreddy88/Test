package com.bootcamp.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName="lookOutput")
	public String getShopInfo(@WebParam(partName="lookupInput") String Property) throws InvaInputException{
		String response = null;
		if("shopName".equals(Property)){
			response = "Test Mart";
		}
		else if("since".equals(Property)){
			response = "since 2001";
		}
		else{
			throw new InvaInputException("Invalid Input", Property+"is not valid Input");
		}
		return response;
	}

}
