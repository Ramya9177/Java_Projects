package com.zensaer.training.bean;

import java.util.Iterator;
import java.util.List;

public class LengthCountingRunnable implements Runnable{
	List<String> list;
	public int sum=0;

	public LengthCountingRunnable(List<String> list) {
		super();
		this.list = list;
	}


	@Override
	public void run() {
		synchronized (list) {
			
		Iterator<String> it =list.iterator();
		
		while(it.hasNext()) {
			String str=it.next();
			sum=sum+str.length();
		}
		}
		//System.out.println("The Length Sum : "+sum);
	}
}
