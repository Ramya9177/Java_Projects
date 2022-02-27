package com.zensar.training.bean;

public interface Checker {
	public static void checkINit(int i) {
		System.out.println("Intializing");
	}
	default  public void check(int i)
	{
		System.out.println(i);
	}
	public void greet(String s);

}
