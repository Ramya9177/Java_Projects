package com.zensaer.training.bean;

import java.util.List;

public class StringAdderRunnable implements Runnable{
	
	List<String> list;
	
	

	public StringAdderRunnable(List<String> list) {
		super();
		this.list = list;
	}



	@Override
	public void run() {
		
		synchronized (list) {
		list.add("Mumbai");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		list.add("delhi");
		
	}
	}

}
