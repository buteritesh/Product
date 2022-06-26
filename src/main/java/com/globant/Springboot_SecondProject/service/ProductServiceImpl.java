package com.globant.Springboot_SecondProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globant.Springboot_SecondProject.dao.ProductDao;
import com.globant.Springboot_SecondProject.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired(required=true)
	ProductDao dao;

	@Override
	public boolean saveProduct(Product product) {
		
		return dao.saveProduct(product);
	}

	@Override
	public Product getProduct(int productID) {
		
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		
		return null;
	}

	@Override
	public boolean deleteProduct(int productID) {
		
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		
		return false;
	}

}
