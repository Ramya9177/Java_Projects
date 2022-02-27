package com.zensar.training.bean;



public class Customer implements Comparable<Customer>{
	
	int id;
	String name;
	double balance;
	
	
	
	public Customer(int id, String name, double balance) throws Exception{
		super();
		this.id = id;
		this.name = name;
		this.setBalance(balance);
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



	public void setBalance(double balance) throws Exception{
		if(balance<0) {
			Exception e=new Exception("Invalid Balance");
			
			throw e;
			
			/*catch(Exception e1) {
				System.out.println(e1.getMessage());
			}*/
		}
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
