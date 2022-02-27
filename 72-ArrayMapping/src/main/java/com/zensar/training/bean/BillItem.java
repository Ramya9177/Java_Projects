package com.zensar.training.bean;

import javax.persistence.Embeddable;

@Embeddable
public class BillItem {//composit class
	String productName;
	double price;
	int quantity;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
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
	public void setQuantity(int quality) {
		this.quantity = quality;
	}
}
