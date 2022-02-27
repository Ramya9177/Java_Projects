package com.zensar.training.bean;

import java.util.Arrays;

public class Product {
	int id;
	String name;
	int discounts[] =new int[4];
	public Product(int id, String name, int[] discounts) {
		super();
		this.id = id;
		this.name = name;
		this.discounts = discounts;
	}
	public Product() {
		super();
	}
	public Product(String name, int[] discounts) {
		super();
		this.name = name;
		this.discounts = discounts;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getDiscounts() {
		return discounts;
	}
	public void setDiscounts(int[] discounts) {
		this.discounts = discounts;
	}	
	
	public void setDiscounts(int position, int discount){
		discounts[position]=discount;
	}
	@Override
	public String toString() {
		return "\nProduct [id=" + id + ", name=" + name + ", discounts=" + Arrays.toString(discounts) + "]";
	}
	
	
}
