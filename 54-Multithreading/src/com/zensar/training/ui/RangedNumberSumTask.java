package com.zensar.training.ui;

public class RangedNumberSumTask implements Runnable{
	
	int start;//10
	int end;//20
	
	
	public RangedNumberSumTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}


	@Override
	public void run() {
		//find the sum of the number between 10 and 20
		//sum should printed
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum+=i;
		}
		System.out.println(Thread.currentThread().getName()+" : "+sum);
	}

}
