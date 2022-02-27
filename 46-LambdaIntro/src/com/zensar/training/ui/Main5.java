package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Executable;
import com.zensar.training.bean.Rectangle;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class Main5 {

	public static void main(String[] args) {
		Executable<String> executable1;
		executable1 = executable1 = (s) -> {
			return s.length();
		};
		System.out.println(executable1.execute("zensar"));

		Executable<Double> executable2 = (obj) -> obj.intValue();
		System.out.println(executable2.execute(45.8));

		Executable<Float> executable3 = (obj) -> obj.intValue();
		System.out.println(executable3.execute(45.8f));

		Executable<Circle> executable4 = (obj) -> obj.getRadius();
		System.out.println(executable4.execute(new Circle(5)));

		Executable<Rectangle> executable5 = (obj) -> obj.getArea();
		System.out.println(executable5.execute(new Rectangle(7, 3)));

		Executable<Square> executable6 = (obj) -> obj.calculateArea();
		System.out.println(executable6.execute(new Square(5)));

		Executable<Student> executable7 = (obj) -> obj.getRollNo();
		System.out.println(executable7.execute(new Student(7)));
	}

}
