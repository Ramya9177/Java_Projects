package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		Collection<Double> collection;
		collection = new ArrayList<Double>();

		collection.add(45.6);
		collection.add(98.5);
		collection.add(100.0);
		collection.add(46.7);
		collection.add(45.6);
		collection.add(90.99);

		System.out.println(collection);

		System.out.println("Size : "+collection.size());

		collection.remove(100.0);
		System.out.println(collection);

		System.out.println(collection.contains(45.6));

		System.out.println(collection.isEmpty());

		//collection.clear();
		Iterator<Double> it=collection.iterator();
		while(it.hasNext()) {
			Double obj=it.next();
			System.out.println(obj.intValue());
		}
		
		System.out.println("----------------------");
		//modern way for each loop
		for(Double double1:collection) {
			System.out.println(double1.longValue());
		}
		System.out.println(collection.isEmpty());

		System.out.println(collection);

		System.out.println("Size : "+collection.size());
		
	}
}
