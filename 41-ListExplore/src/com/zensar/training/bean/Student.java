package com.zensar.training.bean;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>{
	int rollno;
	String name;
	String department;
	int marks;
	
	public Student(int rollno) {
		super();
		this.rollno = rollno;
	}

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
	public int hashCode() {
		return Objects.hash(rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollno == other.rollno;
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
