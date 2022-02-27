package com.zensar.training.ui;

public class Main9 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new GoodByeTask());
		t1.setDaemon(true);
		t1.start();
		System.out.println(t1.isDaemon());
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			Thread.sleep(1000);
		}

	}

}
//thread 1 open file and count how many lines in random access file 
//thread 2 total salary of employees connect to database