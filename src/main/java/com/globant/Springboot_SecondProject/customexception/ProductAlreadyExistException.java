package com.globant.Springboot_SecondProject.customexception;

public class ProductAlreadyExistException extends Exception{
	
	public ProductAlreadyExistException(String msg) {
		
		super(msg);
		
	}

}
