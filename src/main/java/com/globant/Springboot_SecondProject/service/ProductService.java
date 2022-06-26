package com.globant.Springboot_SecondProject.service;

import java.util.List;

import com.globant.Springboot_SecondProject.entity.Product;

public interface ProductService {
	public boolean saveProduct(Product product);
	public Product getProduct(int productID);
	public List<Product> getAllProduct();
	public boolean deleteProduct(int productID);
	public boolean updateProduct(Product product);

}
