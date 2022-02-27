package com.zensar.training.ui;
import com.zensar.training.bean.NumberProcessing;
public class Main {
	public static void main(String[] args) {
		
	NumberProcessing numberProcessing;
	numberProcessing=new NumberProcessing(10);
	
	numberProcessing.add(34);
	numberProcessing.add(18);
	numberProcessing.add(22);
	numberProcessing.add(66);
	numberProcessing.add(76);
	numberProcessing.add(9);
	numberProcessing.add(87);
	numberProcessing.add(90);
	numberProcessing.add(56);
	numberProcessing.add(8);
	System.out.println(numberProcessing.toString());
	System.out.println("Minimum number : "+numberProcessing.getMinimum());
	System.out.println("Maximum number : "+numberProcessing.getMaximum());
	System.out.println("summation : "+numberProcessing.getSum());


	}

}
