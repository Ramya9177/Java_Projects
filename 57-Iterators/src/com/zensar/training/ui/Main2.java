package com.zensar.training.ui;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main2 {

	public static void main(String[] args) {
		List<String> names=new CopyOnWriteArrayList<>();
		names.add("Ramya");
		names.add("Williams");
		names.add("Jack");
		names.add("vicky");
		names.add("jhon");
		
		//copy data in other location for that an iterator is created 
		Iterator<String> it=names.iterator();//Fail safe iterators
		while(it.hasNext()) {
			System.out.println(it.next());
			names.add("jackson");
		}
		System.out.println(names);

	}

}


//ConcurrentHashMap is a fail safe version of HashMap