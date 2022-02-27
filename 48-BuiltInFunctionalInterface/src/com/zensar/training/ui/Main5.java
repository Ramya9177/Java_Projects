package com.zensar.training.ui;

import java.time.LocalDate;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;

import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Student;
import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;

public class Main5 {

	public static void main(String[] args) {
		ToDoubleFunction<Student> function1;
		function1=(s)->s.getAverageMark();
		System.out.println(function1.applyAsDouble(new Student(203,"Ramya",Gender.FEMALE,90.5,"cse")));

		ToDoubleFunction<Circle> function2;
		function2=(s)->s.computeArea();
		System.out.println(function2.applyAsDouble(new Circle(7)));
		
		ToDoubleFunction<Employee> function3;
		function3=(e)->e.computeAllowance();
		System.out.println(function3.applyAsDouble(new Employee(120,"Ramya",'A',LocalDate.now(),1200.50,Gender.FEMALE)));
	}

}
