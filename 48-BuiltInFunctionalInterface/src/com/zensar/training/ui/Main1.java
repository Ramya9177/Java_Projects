package com.zensar.training.ui;


import java.time.LocalDate;
import java.util.function.Consumer;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Rectangle;
import com.zensar.training.bean.Square;
public class Main1 {
	public static void main(String[] args) {
		Consumer<String> consumer1;
		consumer1=(String s)->{
			System.out.println(s.length());
		};
		consumer1.accept("Zensar");
		
		Consumer<String> consumer2=(s)-> System.out.println(s.length());
		consumer2.accept("Welcome to Zensar");
		
		Consumer<Integer> consumer3=(i)->System.out.println(i.doubleValue());
		consumer3.accept(new Integer(45));
		
		Consumer<Circle> consumer4=(c)->System.out.println(c.computeArea());
		consumer4.accept(new Circle(10));
		
		consumer4=(c)->System.out.println(c.getDiameter());
		consumer4.accept(new Circle(6));
		
		Consumer<Employee> consumer5=(e)->System.out.println(e.toString());
		Employee employee=new Employee(5001,"Ramya",'A',LocalDate.now(),1000,Gender.MALE);
		consumer5.accept(employee);
		
		consumer5=(e)->System.out.println("Allowance : "+e.computeAllowance()+",Basicsal :  "+e.getBasicSalary());
		consumer5.accept(employee);
		
		Consumer<Rectangle> consumer6=(r)->System.out.println(r.getArea());
		consumer6.accept(new Rectangle(4,5));
		
		Consumer<Square> consumer7=(s)->System.out.println(s.calculateArea());
		consumer7.accept(new Square(4));
		
		Consumer<CollectionFactory> consumer8=(c1)->System.out.println(c1.getStudentList());
		consumer8.accept(new CollectionFactory());
		
	}
}
