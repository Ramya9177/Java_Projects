package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.zensar.training.bean.Customer;

public class Main12 {
	public static void main(String[] args) {
		Double obj1=new Double(99.0);
		Double obj2=new Double(40.0);
		Double obj3=new Double(68.71);
		
		Map<String,Double> results=new HashMap<>();
		results.put("maximum", obj1);
		results.put("minimum", obj2);
		results.put("averang", obj3);
		System.out.println(results);
		
		/*Set<String> keys=results.keySet();
		for(String key:keys) {
			System.out.println(key+" = "+results.get(key));
		}*/
		
		
		Customer customer1=new Customer(1011,"raghu",1500.00);
		Customer customer2=new Customer(1044,"ravi",1540.00);
		Customer customer3=new Customer(1010,"ram",1570.00);
		Customer customer4=new Customer(1001,"ra0",1530.00);
		Customer customer5=new Customer(1010,"goutham",1579.00);
		Customer customer6=new Customer(1001,"aruhi",1538.00);
		
		List<Customer> bangaloreCustomer=new ArrayList();
		bangaloreCustomer.add(customer1);
		bangaloreCustomer.add(customer2);
		
		List<Customer> mumbaiCustomer=new ArrayList();
		mumbaiCustomer.add(customer3);
		mumbaiCustomer.add(customer4);
		mumbaiCustomer.add(customer5);
		mumbaiCustomer.add(customer6);
		
		
		Map<String,List<Customer>> cityMap=new TreeMap<>();
		cityMap.put("Balngalore", bangaloreCustomer);
		cityMap.put("Mumbai", mumbaiCustomer);
		System.out.println(cityMap);
		
		//print only bangalore customers
		System.out.println("--------bangaloreCustomers-----");
		Map<String,List<Customer>> cityMap1=new TreeMap<>();
		cityMap1.put("Banglore", bangaloreCustomer);
		System.out.println(cityMap1);
		
		//print how many customers in mumbai
		System.out.println("--------mumbaiCustomers-----");
		Map<String,List<Customer>> cityMap2=new TreeMap<>();
		cityMap2.put("Mumbai", mumbaiCustomer);
		System.out.println(cityMap2);
		
		//compute total of balance from mumbai customers
		System.out.println("------totalBalanceofMumbaiCustomers-----");
		Iterator<Customer> it=((List<Customer>) cityMap2).iterator();
	    double totalBal=0.0;
		while(it.hasNext()) {
			to
			
		}
		
	}

}
