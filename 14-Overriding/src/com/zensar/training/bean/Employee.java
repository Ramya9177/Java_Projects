package com.zensar.training.bean;

public class Employee {
	public double basicSalary;
	 public Employee() {
		 System.out.println("emp");
	 }
	public  double computeNetSalary() {
		System.out.println("employee computenetsalary");
		return this.basicSalary+this.basicSalary*0.35;
	}
	
	public static void m1() {
		System.out.println("m1 in employee");
	}
	private void m2(int a,int b) {//private cannot overriden
		System.out.println(a+b);
	}
}
