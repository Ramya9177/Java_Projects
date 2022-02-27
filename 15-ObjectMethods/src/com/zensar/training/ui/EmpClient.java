package com.zensar.training.ui;

import com.zensar.training.bean.Employee;;
public class EmpClient {

	public static void main(String[] args) {
		
		Employee employee = new Employee(101,"ramya",10000.00);
		
		Employee employee2=new  Employee(101,"dadi",29000.00);
		
		System.out.println(employee.equals(employee2));
		
	}

}
