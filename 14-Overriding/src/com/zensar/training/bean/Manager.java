package com.zensar.training.bean;

public class Manager extends Employee{
	public double incentive;
    
	public Manager() {
		System.out.println("manager");
	}
	public double computeNetSalary() {
		System.out.println("Manager computeNetSalary");
		return this.basicSalary+this.basicSalary*0.35+incentive;
	}
	
	
	public static void m1() {
		System.out.println("m1 in employee");
	}
	public void m2(int a,int b) {
		System.out.println(a*a+b);
	}
}
