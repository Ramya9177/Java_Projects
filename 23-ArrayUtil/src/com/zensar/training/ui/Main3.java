package com.zensar.training.ui;
import java.util.Arrays;
import static java.util.Arrays.sort;
import static java.util.Arrays.binarySearch;


public class Main3 {

	public static void main(String[] args) {
		
		String[] cities= {"mumbai","delhi","pune"};
		
		String str=Arrays.toString(cities);
		System.out.println(str);
		
		sort(cities);
		System.out.println(Arrays.toString(cities));  
		
		
		System.out.println(binarySearch(cities, "pune"));
		
	}

}
