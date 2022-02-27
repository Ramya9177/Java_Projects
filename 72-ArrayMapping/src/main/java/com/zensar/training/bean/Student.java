package com.zensar.training.bean;

import java.util.Arrays;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="students_50")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int rollNo;
	
	@Column(name="s_name")//optional 
	String name;
	
	@ElementCollection//mark is a kind of collection so data in that is element so elementcollection
	@OrderColumn(name="idx")//index values of collection[0,1,2....]
	@CollectionTable(name="students_50_marks50")//name of the table which is seperate table
	double[] marks=new double[3];
	
	@Transient//in database index is a key word so we cannot create column by this name so we annotote like transient
	//or @Column(name="ind")
	int index;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double[] getMarks() {
		return marks;
	}
	public void setMarks(double[] marks) {
		this.marks = marks;
	}
	
	public void setMark(int position, double mark){
		marks[position]=mark;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks="
				+ Arrays.toString(marks)+"]";
	}
	
	

}
