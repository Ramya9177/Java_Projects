package com.zensaer.training.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.zensaer.training.bean.LengthCountingRunnable;
import com.zensaer.training.bean.StringAdderRunnable;

public class Main1 {

	public static void main(String[] args) throws InterruptedException {
		
		List<String> myList=new ArrayList<>();
		myList.add("zensar");
		myList.add("training");
		
		List<String> synchList=Collections.synchronizedList(myList);
		
		StringAdderRunnable adderRunnable=new StringAdderRunnable(synchList);
		LengthCountingRunnable countingRunnable=new LengthCountingRunnable(synchList);
		
		Thread t1=new Thread(adderRunnable);
		Thread t2=new Thread(countingRunnable);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(myList);
		System.out.println(countingRunnable.sum);
		
	}

}
