package com.zensar.training.ui;

public class DummyRunnable implements Runnable{

	@Override
	public synchronized void run() {
		System.out.print("[");
		for(int i=1;i<=5;i++) {
			System.out.print(i+",");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("]");
	}

}
