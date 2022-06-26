package com.globant.Springboot_SecondProject.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.globant.Springboot_SecondProject.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired(required=true)
	private SessionFactory sessionfactory;

	@Override
	public boolean saveProduct(Product product) {
		Session session=null;
		boolean b=false;
		
		try {
			session=sessionfactory.openSession();
			Transaction transaction =session.beginTransaction();
			Criteria criteria=session.createCriteria(Product.class);
			criteria.add(Restrictions.eq("productName", product.getProductName()));
			Product product1 =(Product) criteria.uniqueResult();
			
			if(product1==null) {
			session.save(product);
			transaction.commit();
			b=true;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			session.close();
			
			
		}
		return b;
		
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
