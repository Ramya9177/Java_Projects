package com.zensar.training.bean;

public class Factorial {
	int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	int fact = 1;

	public int isFactorial() {
		for(int i=1;i<=number;i++) {
			fact = fact *i;
		}
		return fact;
	}
}
