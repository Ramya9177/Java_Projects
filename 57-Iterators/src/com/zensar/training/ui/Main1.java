package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {
	
	List<String> names=new ArrayList<>();
	names.add("Ramya");
	names.add("Williams");
	names.add("Jack");
	names.add("vicky");
	
	Iterator<String> it=names.iterator();  //Fail fast iterator
	
	while(it.hasNext()) {
		System.out.println(it.next());
		String str=it.next();
		/*if(str.length()==4) 
			it.remove();*/
		//names.add("meena");
		//names.add("jack");
		names.set(1,"jackson");
	}
	System.out.println(names);
	}
}
///Hashmap is a fail fast iterator of HashMap