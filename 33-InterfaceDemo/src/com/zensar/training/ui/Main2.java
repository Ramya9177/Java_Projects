package com.zensar.training.ui;
import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Shape;

public class Main2 {

	public static void main(String[] args) {
		Circle circle=new Circle(5);
		System.out.println(circle.calculateArea());
		
		Square square=new Square(6);
		
		Shape shape=new Square(25);

	}

}
