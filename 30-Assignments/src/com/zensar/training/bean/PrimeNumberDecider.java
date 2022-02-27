package com.zensar.training.bean;

public class PrimeNumberDecider {
	
	int number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	boolean isprime=true;
	
	public boolean isPrimeNumber() {
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0) {
				isprime=false;
				break;
			}
		}
		if(isprime==false)
			return false;
		else
			return true;
		
	}
}
