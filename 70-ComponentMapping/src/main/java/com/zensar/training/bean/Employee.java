package com.zensar.training.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//mandatory annotation
@Table(name = "employees_20")//not mandatory annotation
public class Employee {
	@Id
	@Column(name = "E_Id")//
	@GeneratedValue(strategy = GenerationType.AUTO)//not mandatory
	int empId;

	@Column(name = "E_N")
	String name;

	@Column(name = "E_G")
	char grade;
	@Column(name = "E_BSal")
	double basicSalary;
	@Column(name = "E_DOJ")
	LocalDate dateOfJoining;
	
	@Embedded//special case so mandatory annotation
	Address address;

	public Employee(String name, char grade, double basicSalary, LocalDate dateOfJoining, Address address) {
		super();
		this.name = name;
		this.grade = grade;
		this.basicSalary = basicSalary;
		this.dateOfJoining = dateOfJoining;
		this.address = address;
	}

	public Employee(String name, char grade, double basicSalary, LocalDate dateOfJoining) {
		super();
		this.name = name;
		this.grade = grade;
		this.basicSalary = basicSalary;
		this.dateOfJoining = dateOfJoining;
	}

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", name=" + name + ", grade=" + grade + ", basicSalary=" + basicSalary
				+ ", dateOfJoining=" + dateOfJoining + ", address=" + address + "]";
	}

}
