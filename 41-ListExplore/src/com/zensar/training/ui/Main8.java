package com.zensar.training.ui;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main8 {

	public static void main(String[] args) {
		Set<String> myset=new HashSet<>();
		
		myset.add("Welcome");
		myset.add("Ramya");
		myset.add("to");
		myset.add("zensar");
		myset.add("Welcome");
		
		System.out.println(myset);
		System.out.println(myset.size());
	System.out.println(myset.contains("Welcome"));
		System.out.println(myset.isEmpty());
	myset.remove("welcome");
		myset.clear();
		System.out.println(myset.isEmpty());
		
		Iterator<String> it=myset.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str.toUpperCase());
		}

	}

}
