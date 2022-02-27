package com.zensar.training.ui;

import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Scale;

public class Main {

	public static void main(String[] args) {

		Gender gender=Gender.MALE;
		System.out.println(gender.getAverageHeight());
		System.out.println(gender.getAverageWeight());
		System.out.println(gender.getValue());
		
		//Gender enum values
		Gender[] arr1=Gender.values();
		for(Gender g:arr1) {
			System.out.println(g);
		}
		System.out.println("--------");
		Scale scale=Scale.FULL;
		System.out.println(scale.getQuantity());
		System.out.println(scale);
		
		//to print all Scale enum values
		Scale[] arr=Scale.values();
		for(Scale s:arr) {
			System.out.println(s);
		}
	}

}
