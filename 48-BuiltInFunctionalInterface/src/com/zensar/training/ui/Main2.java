package com.zensar.training.ui;

import java.util.function.Supplier;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Student;

public class Main2 {

	public static void main(String[] args) {
		Supplier<Integer> supplier1;
		supplier1=()->new Integer(100);
		System.out.println(supplier1.get());
		
		Supplier<Circle> supplier2=()->new Circle(25);
		System.out.println(supplier2.get());
		
		Supplier<Student> supplier3=()->new Student(203,"Ramya",Gender.FEMALE,12.6,"CSE");
		System.out.println(supplier3.get().getDepartment());
	}

}
