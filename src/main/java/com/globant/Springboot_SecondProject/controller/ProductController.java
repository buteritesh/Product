package com.globant.Springboot_SecondProject.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.globant.Springboot_SecondProject.customexception.ProductAlreadyExistException;
import com.globant.Springboot_SecondProject.entity.Product;
import com.globant.Springboot_SecondProject.service.ProductService;

@RestController
@RequestMapping("/product")
@Validated
public class ProductController {
	
	@Autowired(required=true)
	ProductService service;
	
	@PostMapping(value="/saveProduct")
	public ResponseEntity<Object> saveProduct (@Valid @RequestBody Product product) throws ProductAlreadyExistException{
		
		Boolean b= service.saveProduct(product);
		if(b==true) {
			return new ResponseEntity<Object>("Product save successfully!!",HttpStatus.OK);
		}
		else {
			   throw new ProductAlreadyExistException("Product already exist!!");
		}
		
	}

}
