package com.zensar.training.bean;

public class Employee {
	private String Name;
	private double Salary;
	
	public Employee(String name, double salary) {
		super();
		Name = name;
		Salary = salary;
	}
	
	public Employee() {
		super();
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	public double computeAllowance() {
		return this.Salary*0.35;
	}
	public double computeNetSalary() {
		return this.Salary+this.computeAllowance();
	}
}
