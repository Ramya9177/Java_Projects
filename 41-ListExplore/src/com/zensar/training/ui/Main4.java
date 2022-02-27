package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		
		list.add("Welcome");
		list.add("Hello");
		list.add("zensar");
		list.add("Training");
		list.add("Welcome");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		list.set(1, "Hyderabad");
		System.out.println(list.indexOf("zensar"));
		list.indexOf("Training");
		list.add(2,"Chenni");
		System.out.println(list);
		
		for(String str:list) {
			System.out.println(str.toUpperCase());
		}
		
	}

}
