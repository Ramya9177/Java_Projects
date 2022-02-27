package com.zensar.training.bean;

import java.util.Objects;

public class Customer implements Comparable<Customer>{
	
	int id;
	String name;
	double balance;
	
	
	
	public Customer() {
		super();
	}



	public Customer(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
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



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	@Override
	public int compareTo(Customer o) {
		/*if(this.id<o.id)
			return -1;
		if(this.id>o.id)
			return 1;*/
		int res=this.name.compareTo(o.name);
		return 0;
	}



	@Override
	public String toString() {
		return "\nCustomer [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return id == other.id;
	}
	
	

}
