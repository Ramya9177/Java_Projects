package com.zensar.training.ui;

public class Main1 {

	public static void main(String[] args) {
		
		System.out.println("program begins.....");
		
		int a=100;
		int b=0;
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException  e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("program ends......");
		
	}

}
