package com.zensar.training.ui;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.zensar.training.bean.Employee;

public class Main2 {

	public static void main(String[] args) throws ClassNotFoundException{
		//Class myClass=Class.forName("java.lang.Comparable");
		//Class myClass=Class.forName("com.zensar.training.bean.Student");
		Class myClass=Employee.class;
		
		System.out.println(myClass.getSimpleName());
		Method[] allmethods=myClass.getDeclaredMethods();
		for(Method m:allmethods) {
			System.out.println(m);
		}
		System.out.println("--------------------------------------------------");
		Field[] allFields=myClass.getDeclaredFields();
		
		for(Field field:allFields) {
			System.out.println(field);
		}
		System.out.println("----------------------------------------------------");
		Constructor[] constructors=myClass.getConstructors();
		for(Constructor c:constructors) {
			System.out.println(c);
	}

}
}
