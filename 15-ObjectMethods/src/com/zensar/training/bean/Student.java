package com.zensar.training.bean;

import java.util.Objects;

public class Student {
	public String name;
	public int mark;
	public char grade;
	@Override
	public String toString() {
		return "Student [name=" + this.name + ", mark=" + this.mark + ", grade=" + this.grade + "]";
	}
	
	public int hashCoad() {
		
		return Objects.hash(grade);
	}
	public boolean equals(Object obj) {
		Student other =(Student)obj;
		if(this.name.equals(other.name))
			return true;
		return false;
	}
	public void finalize() {
		System.out.println("object is removed");
	}
}

