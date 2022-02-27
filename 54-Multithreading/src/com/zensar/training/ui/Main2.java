package com.zensar.training.ui;

public class Main2 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new CityPrintingThread();//new state
		t1.start();                        //runnable state ready to start
		
		t1.join();
		System.out.println(t1.isAlive());

		for(int i=1;i<=25;i++) {
			System.out.println(i);
		}// current running thread main
		//t1->running
		}

}
