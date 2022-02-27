package com.zensar.training.ui;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Student;

public class Main1 {
	static void receive(Object obj) {
		Class objectsClass=obj.getClass();//
		System.out.println(objectsClass.getSimpleName());
		Method[] allmethods=objectsClass.getDeclaredMethods();
		for(Method m:allmethods) {
			System.out.println(m);
		}
		System.out.println("--------------------------------------------------");
		Field[] allFields=objectsClass.getDeclaredFields();
		
		for(Field field:allFields) {
			System.out.println(field);
		}
		System.out.println("----------------------------------------------------");
		Constructor[] constructors=objectsClass.getConstructors();
		for(Constructor c:constructors) {
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		Circle circle=new Circle();
		Student student=new Student();
		Employee employee=new Employee();
		//receive(circle);
		receive(student);
		//receive(employee);

	}
}
