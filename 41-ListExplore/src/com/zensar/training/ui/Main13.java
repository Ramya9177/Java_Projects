package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.List;

import com.zensar.training.bean.Circle;

public class Main13 {

	public static void main(String[] args) {
		List<Circle> circles = new ArrayList<>();// pure collection
		circles.add(new Circle(25));
		circles.add(new Circle(20));

		for (Circle c1 : circles) {
			System.out.println(c1.computeArea());
		}

		List list = new ArrayList();
		list.add("Zensar");
		list.add(new Integer(45));
		list.add(new Circle(4));

		for (Object obj : list) {
			if (obj instanceof String) {
				String str = (String) obj;
				System.out.println(str.toUpperCase());
			}
			if (obj instanceof Integer) {
				Integer i = (Integer) obj;
				System.out.println(i.doubleValue());
			}
			if (obj instanceof Circle) {
				Circle c = (Circle) obj;
				System.out.println(c.computeArea());
			}

		}

	}
}
