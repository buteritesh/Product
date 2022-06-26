package com.globant.Springboot_SecondProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Product")
public class Product {
	 
	 @Id
	 @Column(nullable=false)
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int productID;
	 @Column(unique =true)
	 @NotNull(message="Product name not be null")
	 @NotBlank(message="Product name never be blank")
	 private String productName;
	 @NotNull(message="Supplier id not be null")
	 @NotBlank(message="Supplier id never be blank")
	 private int supplierID;
	 @NotNull(message="QuantityPerUnit not be null")
	 @NotBlank(message="QuantityPerUnit never be blank")
	 private String quantityPerUnit;
	 @NotNull(message="UnitPrice not be null")
	 @NotBlank(message="UnitPrice never be blank")
	 private float unitPrice;
	 
	 Product(){
		 super();
		 
	 }

	public Product(int productID, String productName, int supplierID, String quantityPerUnit, float unitPrice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.supplierID = supplierID;
		this.quantityPerUnit = quantityPerUnit;
		this.unitPrice = unitPrice;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", supplierID=" + supplierID
				+ ", quantityPerUnit=" + quantityPerUnit + ", unitPrice=" + unitPrice + "]";
	}
	 
	 

}
