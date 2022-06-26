package com.globant.Springboot_SecondProject.customexception;

public class ProductNotFoundException extends RuntimeException {
	
	public ProductNotFoundException(String msg) {
		super(msg);
	}

}
