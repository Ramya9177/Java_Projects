package com.zensar.training.ui;

import java.util.LinkedList;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names=new LinkedList<>();
		names.add("Ramya");
		names.add("Jhansi");
		names.add("Deepthi");
		
		//names.stream().map((s)->s.toUpperCase()).forEach((s)->System.out.println(s));
	
		names.stream().map(String::toUpperCase).forEach((s)->System.out.println(s));
		     //method reference for a method in arbitory objects of particular type(String)
		
	}

}
