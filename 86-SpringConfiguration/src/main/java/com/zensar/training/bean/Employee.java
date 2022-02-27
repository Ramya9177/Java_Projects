package com.zensar.training.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	int id;
	String name;
	double salary;
	
	@Autowired
	Address address;
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, double salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public Employee(String name, double salary, Address address) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("Employee is created and will be initilized");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Employee is to be removed");
	}
	
}
