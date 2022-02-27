package com.zensar.training.ui;

import java.util.function.Predicate;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class Main3 {
	
	static void demo1(Predicate<Square> predicate,Square s) {
		System.out.println(predicate.test(s));
	}
	static void demo2(Predicate<Square> predicate,Square s) {
		System.out.println(predicate.test(s));
	}
	static void demo3(Predicate<Student> predicate,Student  student) {
		System.out.println(predicate.test(student));
	}
	static void demo4(Predicate<Student> predicate,Student  student) {
		System.out.println(predicate.test(student));
	}

	public static void main(String[] args) {
		Predicate<Circle> predicate1;
		predicate1=(Circle c)->c.getRadius()>100? true:false;
		/*{
			if(c.getRadius()>100)
				return true;
			return false;
		};*/
		System.out.println(predicate1.test(new Circle(20)));
		
		Predicate<String> predicate2;
		predicate2=(s)->s.length()>10? true:false;
		System.out.println(predicate2.test("Zensar training"));
		
	  
	   demo1((s)->s.getSize()>5? true:false,new Square(10));
	   demo2((s)->s.calculateArea()>100?true:false, new Square(8));
	   demo3((s1)->s1.getAverageMark()>65.0?true:false,new Student(405,"Ramya",Gender.FEMALE,70.8,"CSE"));
	   demo4((s2)->s2.getGender().equals(Gender.MALE)?true:false,new Student(405,"Ram",Gender.MALE,70.8,"CSE"));
	}

}
