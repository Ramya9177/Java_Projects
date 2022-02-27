package com.zensar.training.ui;

import com.zensar.training.bean.IntStackImpl;

public class Main {
	public static void main(String[] args) {

	IntStackImpl intStack=new IntStackImpl(10);
	
	intStack.push(25);
	intStack.push(2);
	intStack.push(5);
	intStack.push(15);
	intStack.push(21);
	intStack.push(20);
	
	System.out.println(intStack.toString());
	System.out.println(intStack.pop());
	System.out.println(intStack.pop());
	System.out.println(intStack.pop());
	System.out.println(intStack.pop());
	System.out.println(intStack.toString());
	}
	

}
