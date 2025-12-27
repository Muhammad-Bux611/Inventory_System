package com.inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int productId;
	private String productName;
	private String discription;
	private double price;
	private int quantity;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product( String productName, String discription, double price, int quantity) {
		super();
		this.productName = productName;
		this.discription = discription;
		this.price = price;
		this.quantity = quantity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", discription=" + discription
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
}
