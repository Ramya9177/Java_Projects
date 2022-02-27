package com.zensar.training.ui;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main11 {
	public static void main(String[] args) {
		Map<String, String> map1;
		map1=new HashMap<>();
		
		map1.put("CountryName","India");
		
		String s1="capital";
		String s2="Delhi";
		
		map1.put(s1,  s2);
		map1.put("president","Ramnath Govindh");
		
		System.out.println(map1);
		map1.put("president","modi");
		System.out.println(map1);
		System.out.println(map1.get("capital"));
		System.out.println(map1.get("president"));
		
		Set<String> allkeys=map1.keySet();
		for(String key:allkeys) {
			System.out.println(key+" : "+map1.get(key));
		}
		Collection<String> allValues=map1.values();
		System.out.println(allValues);
	}

}
