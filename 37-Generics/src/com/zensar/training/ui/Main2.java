package com.zensar.training.ui;

import com.zensar.training.bean.Analyzer;

public class Main2 {

	public static void main(String[] args) {
		Analyzer<Integer, String> analyzer=new Analyzer<>();
		analyzer.setData1(100);
		analyzer.setData2("Welcome");
		
		Analyzer<Double, String> analyzer1=new Analyzer<>();
		analyzer1.setData1(100.0);
		analyzer1.setData2("Welcome");
	}
 
}
