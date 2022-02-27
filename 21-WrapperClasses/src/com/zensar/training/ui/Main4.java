package com.zensar.training.ui;

public class Main4 {

	public static void main(String[] args) {
		double d=800.00;
		
		Double obj=d;//auto boxing 1.5version...
		//obj.doubleValue();
		
		double d1=obj;//auto unboxing
		
		Double obj1=new Double(900.0);
		
		//immmutable classes Wrapper classes
		//double f=obj1.doubleValue();
		//f++;
		//Double temp=new Double(f);
		//obj1=temp;
		obj1++;
		double k=10+obj1;
		System.out.println(obj1);
	}

}
