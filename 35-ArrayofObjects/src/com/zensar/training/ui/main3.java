package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Square;

public class main3 {

	public static void main(String[] args) {
		Object obj;
		obj = new Circle(5); // upcasting ..implicit

		Circle temp = (Circle) obj;// downcasting ...explicitly
		System.out.println(temp.getRadius() + ", " + temp.computeArea());

		System.out.println(obj);

		obj = new Square(10);
		Square tempSquare = (Square) obj;
		System.out.println(tempSquare.getSize() + ", " + tempSquare.calculateArea());

		obj = new String("Welcome");
		String tempString = (String) obj;
		System.out.println(tempString.toUpperCase());

		obj = new Integer(10);
		Integer tempInteger = (Integer) obj;
		System.out.println(tempInteger.doubleValue());

		obj = new Double(10.0);
		Double tempDouble = (Double) obj;
		System.out.println(tempDouble.intValue());
		obj = new Float(5.9);

		Object obj1 = new Square(90);
		// Square square=(Square)obj1; //run time error

		// System.out.println(obj1 instanceof String);
		// safe typecasting
		if (obj1 instanceof Circle) {
			Circle tmp = (Circle) obj1;
			System.out.println("Circle : "+tmp);
		}
		if (obj1 instanceof Square) {
			Square tmp = (Square) obj1;
			System.out.println("Square : "+tmp.calculateArea());
		}
		if (obj1 instanceof String) {
			String tmp = (String) obj1;
			System.out.println("String : " +tmp.charAt(0));
		}
	}

}
