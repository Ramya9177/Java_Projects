package com.zensar.training.ui;

import com.zensar.training.bean.Processing;

public class Main {

	public static void main(String[] args) {
		Processing<String> processing=new Processing<String>();
		processing.setData("welcome");
		String s=processing.getdata();
		System.out.println(s.toLowerCase());
		
		Processing<Double> processing1=new Processing<Double>();
		processing1.setData(10.0);
		Double d=processing1.getdata();
		System.out.println(d.intValue());
		
		Processing processing2=new Processing();
		processing2.setData(10);
		Integer I=(Integer)processing2.getdata();
		System.out.println(I.longValue());
		
	}

}
