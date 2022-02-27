package com.zensar.training.ui;

import java.util.Collections;
import java.util.List;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Student;
import com.zensar.training.bean.comparator.StudentDepartmentComparator;
import com.zensar.training.bean.comparator.StudentMarkComparator;

public class Main1 {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t=Thread.currentThread();
		
		Thread t1=new CityPrintingThread();
		t1.setName("city printing Thread");
		t1.start();
		
		CountryPrintingTask countryPrintingTask=new CountryPrintingTask();
		Thread t2=new Thread(countryPrintingTask);
		t2.setName("country pT");
		t2.start();
		
		Thread t3=new ReverseNumberPrintingThread();
		t3.setName("Reverse Number");
		t3.start();
		
		RangedNumberSumTask numberSumTask=new RangedNumberSumTask(10,20);
		//numberSumTask.start=10;
		//numberSumTask.end=20;
		Thread t4=new Thread(numberSumTask);
		t4.setName("Range sum ");
		t4.start();
		
		Thread t5=new CircleProcessingThread();
		t5.setName("circle Area ");
		t5.start();
		
		System.out.println("Program Begins");
		for(int i=1;i<=10;i++) {
			System.out.println(t.getName()+" : "+i);
			t.sleep(1000);
		}
		System.out.println("Program Ends");
	}
}
