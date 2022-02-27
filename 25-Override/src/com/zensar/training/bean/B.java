package com.zensar.training.bean;

public class B extends A{
	
	@Override
	public int demo1() {
		return 1;
	}
	
	@Override
	//is a relation relationship (vehcile,car)so it is overrided 
	public Car demo2() {
		return new Car();
	}
	

}
