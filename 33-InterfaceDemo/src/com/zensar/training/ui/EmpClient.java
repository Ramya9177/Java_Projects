package com.zensar.training.ui;

import com.zensar.training.bean.Employee;

public class EmpClient {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setName("Ramya");
		employee.setBasicSalary(1000.00);
		employee.setGrade('B');
		
		System.out.println(employee.getAllowance());
		System.out.println(employee.getDeduction());
	}

}
