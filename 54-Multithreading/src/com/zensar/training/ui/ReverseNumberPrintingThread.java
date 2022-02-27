package com.zensar.training.ui;

public class ReverseNumberPrintingThread extends Thread{
      
	public void run() {
		//logic to print 100-1
		for(int i=100;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}
