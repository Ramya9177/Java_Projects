package com.zensar.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zensar.training.bean.Address;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Student;

@Configuration
public class MyConfig1 {

	@Bean(name = "studBean")
	public Student f1() {
		return new Student();
	}

	@Bean(name = "empBean")
	public Employee employee() {
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Raghu");
		employee.setSalary(20000.00);
		return employee;
	}

	@Bean(name = "address")
	public Address f2() {
		Address address = new Address();
		address.setDoorNo("F-2");
		address.setAreaName("wilsongarden");
		address.setCity("Banglore");
		return address;
	}
}
