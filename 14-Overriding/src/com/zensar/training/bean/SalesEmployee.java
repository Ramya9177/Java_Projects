package com.zensar.training.bean;

public class SalesEmployee extends Employee{
	
	public double salesCommission;
	
	public double computeNetSalary() {
		System.out.println("sales employee");
		return basicSalary+basicSalary*0.35+salesCommission;
	}

}