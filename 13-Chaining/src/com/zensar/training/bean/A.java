package com.zensar.training.bean;

public class A {
	private int x;
	private static int y;
	
	public A() {
		this(10);
		System.out.println("No argument constructor");
	}
	public A(int x) {//constructor are like instance methods
		
		System.out.println("1 argument constriuctor");
		this.x=x;
		this.test1();
		test2();
	}
	public void test1() {
		System.out.println(x);
		System.out.println(y);
		test3();
		test4();
		//methods cannot call constructor directly create an object and create
		new A();
	}
	public static void test2() {
		//System.out.println(x);//static method can only access static not instance variable
		System.out.println(y);
		//test3();
		test4();
		new A();
	}
	public void test3() {
		System.out.println("test3");
	}
	public static void test4() {
		System.out.println("test4 static");
	}
}
