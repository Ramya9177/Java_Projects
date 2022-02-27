
package com.zensar.training.ui;

import com.zensar.training.bean.Square;

public class Main7 {

	public static void main(String[] args) {
		Square square = new Square(10);
		Square square2 = new Square(22);

		if (square.compareTo(square2) < 0) {
			System.out.println("s2 is greater");
		}
		if (square.compareTo(square2) == 0) {
			System.out.println("same");
		}
		if (square.compareTo(square2) > 0) {
			System.out.println("s1 is greater");
		}
		Integer obj1 = new Integer(20);
		Integer obj2 = new Integer(45);
		System.out.println(obj1.compareTo(obj2));

		String s1 = new String("Welcome");
		System.out.println(s1.length());
		String s2 = new String("Welcome To NewYork");
		System.out.println(s2.length());
		System.out.println(s1.compareTo(s2));

	}
}
