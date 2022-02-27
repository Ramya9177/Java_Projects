package com.zensar.training.ui;

import java.util.Arrays;

import com.zensar.training.bean.Student;
import com.zensar.training.bean.StudentDepartmentcomparator;
import com.zensar.training.bean.StudentMarksComparator;
import com.zensar.training.bean.StudentNameComparator;
import com.zensar.training.bean.StudentRollnoComparator;

public class Main2 {

	public static void main(String[] args) {
		Student s1=new Student(2,"ramya","cse",100);
		Student s2=new Student(3,"deepthi","mech",90);
		Student s3=new Student(1,"karthik","ece",80);
		Student s4=new Student(4,"mounika","eee",80);
		
		Student[]students= {s1,s2,s3,s4};
		
		System.out.println(Arrays.toString(students));
		Arrays.sort(students);
		System.out.println("----------------------------");
		System.out.println(Arrays.toString(students));
		
		
		StudentRollnoComparator student1=new StudentRollnoComparator();
		StudentNameComparator student2=new StudentNameComparator();
		StudentDepartmentcomparator student3=new StudentDepartmentcomparator();
		StudentMarksComparator student4=new StudentMarksComparator();
		
		Arrays.sort(students,student1);
		System.out.println("---------ROLLNO------------");
		System.out.println(Arrays.toString(students));
		
		Arrays.sort(students,student2);
		System.out.println("---------NAME------------");
		System.out.println(Arrays.toString(students));
		
		Arrays.sort(students,student3);
		System.out.println("---------DEPARTMENT------------");
		System.out.println(Arrays.toString(students));
		
		Arrays.sort(students,student4);
		System.out.println("-------MARKS----------");
		System.out.println(Arrays.toString(students));
		

	}

}
