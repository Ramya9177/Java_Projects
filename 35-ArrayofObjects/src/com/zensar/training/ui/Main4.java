package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Square;

public class Main4 {

	public static void main(String[] args) {
		Object[] objects;
		objects = new Object[5];
		
		//heterogenous type
		objects[0]=new Circle(1);
		objects[1]=new Square(4);
		objects[2]=new String("Welcome");
		objects[3]=5;
		objects[4]=new Double(45.5);
		
		for(Object obj:objects) {
			if(obj instanceof Circle) {
			Circle circle=(Circle) obj;
			System.out.println("Circle : "+circle.getRadius()+", "+circle.computeArea());
		}
			if(obj instanceof Square) {
				Square square=(Square) obj;
				System.out.println("Square : "+square.getSize()+", "+square.calculateArea());
			}
			if (obj instanceof String) {
				String string = (String) obj;
				System.out.println("String : " +string.toUpperCase());
			}
			if (obj instanceof Integer) {
				Integer integer=(Integer) obj;
				System.out.println("Integer : "+integer.byteValue()+", "+integer*integer);
			}
			if (obj instanceof Double) {
				Double double1=(Double) obj;
				System.out.println("Double : "+double1.floatValue());
			}


	}
	}

}
