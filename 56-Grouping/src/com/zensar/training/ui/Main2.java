package com.zensar.training.ui;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Customer;
import com.zensar.training.bean.Student;

public class Main2 {

	public static void main(String[] args) {
		List<Customer> customers=CollectionFactory.getCustomerList();
		System.out.println(customers);
		
		Map<String, List<Customer>> customersByCityMap;
		customersByCityMap=customers.stream().collect(Collectors.groupingBy(Customer::getCity));
		System.out.println(customersByCityMap);
		

	}

}
