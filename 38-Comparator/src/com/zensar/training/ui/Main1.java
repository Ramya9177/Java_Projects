package com.zensar.training.ui;

import java.util.Arrays;

import com.zensar.training.bean.Customer;
import com.zensar.training.bean.CustomerBalanceComparator;
import com.zensar.training.bean.CustomerIdComparator;
import com.zensar.training.bean.CustomerNameComparator;

public class Main1 {
	public static void main(String[] args) {
		Customer customer1=new Customer(101,"Jhon",2000.0);
		Customer customer2=new Customer(102,"Jhon",2300.0);
		Customer customer3=new Customer(103,"Jhon",35000.0);
		Customer customer4=new Customer(104,"Jhon",12000.0);
		
		Customer[] customer= {customer1,customer2,customer3,customer4};
		
		System.out.println(Arrays.toString(customer));
		Arrays.sort(customer);
		System.out.println("-------------");
		System.out.println(Arrays.toString(customer));
		
		CustomerIdComparator Comparator1=new CustomerIdComparator();
		CustomerBalanceComparator Comparator2=new CustomerBalanceComparator();
		CustomerNameComparator Comparator3=new CustomerNameComparator();
		
		Arrays.sort(customer,Comparator3);
		System.out.println("------------");
		System.out.println(Arrays.toString(customer));

	}
}
