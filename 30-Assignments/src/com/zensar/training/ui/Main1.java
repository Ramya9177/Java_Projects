package com.zensar.training.ui;

import com.zensar.training.bean.Factorial;
import com.zensar.training.bean.PrimeNumberDecider;
import com.zensar.training.bean.LeapYear;

public class Main1 {

	public static void main(String[] args) {
		
		PrimeNumberDecider prime = new PrimeNumberDecider();
		prime.setNumber(5);
		System.out.println("isPrime : "+prime.isPrimeNumber());
		
		Factorial factorial=new Factorial();
		factorial.setNumber(4);
		System.out.println("Factorial : "+factorial.isFactorial());
		
		LeapYear leapYear=new LeapYear();
		leapYear.setYear(1800);
		System.out.println("LeapYear : "+leapYear.isLeapYear());

	}

}
