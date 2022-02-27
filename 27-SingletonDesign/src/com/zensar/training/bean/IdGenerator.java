package com.zensar.training.bean;

public class IdGenerator {//singleton class design pattern
	
	private  int number=0;
	
	private static IdGenerator  generator;
	
	public static IdGenerator getInstance() {
		
		if(generator==null)
			generator=new IdGenerator();
		return generator;
	}
	
	/*public IdGenerator() {//implicit constructor
		super();
	}*/
	
	//explicit constructor
	private IdGenerator() {
		
	}
	
	public int getNextId() {
		return ++this.number;
		
	}
}
