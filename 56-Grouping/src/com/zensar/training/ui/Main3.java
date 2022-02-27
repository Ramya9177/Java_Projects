package com.zensar.training.ui;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Customer;

public class Main3 {

	public static void main(String[] args) {
		List<Customer> customers=CollectionFactory.getCustomerList();
		System.out.println(customers);
		
		
		Map<Boolean, List<Customer>> partition;
		partition=customers.stream().collect(Collectors.partitioningBy(s->s.getBalanceAmount()>2000));
		System.out.println(partition);

	}

}
