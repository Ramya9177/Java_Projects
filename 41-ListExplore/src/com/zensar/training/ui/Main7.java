package com.zensar.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class Main7 {

	public static void main(String[] args) {
		List<Student> list = new LinkedList<>();

		Student s1 = new Student(5, "Ramya", "cse", 100);
		Student s2 = new Student(1, "jhansi", "it", 108);
		Student s3 = new Student(2, "Jhon", "ME", 98);
		Student s4=new Student(6);

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		// System.out.println(list);
		list.add(3, new Student(3, "ram", "civil", 89));
		list.add(0, new Student(4, "ram", "cse", 99));
		list.add(5, new Student(7));
		System.out.println(list);
		Student temp = new Student(3, "goutham", "cse", 45);
		System.out.println(list.indexOf(5));

		System.out.println("-------------------------");

		for (Student student : list) {
			System.out.println(student.compareTo(s3));
		}

		list.clear();
		list = null;

	}

}

