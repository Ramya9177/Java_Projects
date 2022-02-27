package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Square;

public class Main6 {

	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(2);
		System.out.println(c1.compareTo(c2));
		
		Square s1=new Square(5);
		Square s2=new Square(5);
		
		Integer I1=new Integer(4);
		Integer I2=new Integer(5);
		System.out.println(I1.tocompare(I2));

	}

}
