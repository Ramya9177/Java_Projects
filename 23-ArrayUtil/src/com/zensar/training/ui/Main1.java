package com.zensar.training.ui;

import java.util.Arrays;
 
public class Main1 {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 45, 30, 12, 28 };
		String str = "";
		for(int e:arr1) {
			str=str+e+",";
		}
		System.out.println(str);
		String str1=Arrays.toString(arr1);
		System.out.println(str1);
		
		Arrays.sort(arr1);
		for(int e:arr1) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.binarySearch(arr1, 10));

	}

}
