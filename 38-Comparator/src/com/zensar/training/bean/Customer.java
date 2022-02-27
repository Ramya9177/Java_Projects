package com.zensar.training.bean;



public class Customer implements Comparable<Customer>{
	
	int id;
	String name;
	double balance;
	
	
	
	public Customer(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
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
	
	

}
