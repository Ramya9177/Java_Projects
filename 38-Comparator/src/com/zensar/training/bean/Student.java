package com.zensar.training.bean;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	int rollno;
	String name;
	String department;
	int marks;
	public Student(int rollno, String name, String department, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.department = department;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "\nStudent [rollno=" + rollno + ", name=" + name + ", department=" + department + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		if(this.rollno<o.rollno)
			return -1;
		if(this.rollno>o.rollno)
			return 1;
		return 0;
	}
}
