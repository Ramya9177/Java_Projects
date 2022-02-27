package com.zensar.training.ui;

import java.util.Collections;
import java.util.List;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.comparator.EmployeeNameComparator;
import com.zensar.training.bean.comparator.EmployeeSalaryComparator;

public class Main2 {

	public static void main(String[] args) {
		List<Employee>allEmps=CollectionFactory.getEmployeeList();
		System.out.println(allEmps);
		
		//sort this collection
		Collections.sort(allEmps);
		System.out.println(allEmps);
		//binarySearch for Employee whose id 5004
		System.out.println("binary search on Employee : "+Collections.binarySearch(allEmps,new Employee(5004)));
		
		//min
		System.out.println("max : "+Collections.max(allEmps));
		//max
		System.out.println("min : "+Collections.min(allEmps));
		System.out.println("-------------------------------------------------------");
		//sort the collection based on Name
		EmployeeNameComparator enc=new EmployeeNameComparator();
		Collections.sort(allEmps,enc);
		System.out.println(allEmps);
		//binary search for Employee whose id 5004
		System.out.println("binary search on empname : "+Collections.binarySearch(allEmps,new Employee(5003)));
		//min max based on name
		System.out.println(Collections.max(allEmps,new EmployeeNameComparator()));
		System.out.println(Collections.min(allEmps,new EmployeeNameComparator()));
		//max salary
		System.out.println(Collections.max(allEmps,new EmployeeSalaryComparator()));

	}

}
