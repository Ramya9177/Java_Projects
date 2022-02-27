package com.zensar.training.ui;

public class Main10 {

	public static void main(String[] args) {
		
		
		Thread t1=new Thread(new CountLinesInFileTask());
		t1.setName("CLIF");
		t1.start();
		
		Thread t3=new Thread(new RandomAccessFileTask());
		t3.setName("CLIF");
		t3.start();
		
		
		Thread t2=new Thread(new FindTotalSalaryTask());
		t2.setName("FTA");
		t2.start();
	}

}
