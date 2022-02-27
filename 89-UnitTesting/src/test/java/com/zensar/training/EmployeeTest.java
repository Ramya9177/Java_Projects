package com.zensar.training;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.InvalidSalaryException;

public class EmployeeTest {
	
	Employee employee;
	
	@BeforeEach
	public void init() {
		employee=new Employee();
		System.out.println("....init before test......");
	}

	@Test
	@DisplayName("Allowance testing with Postive Number1")
	public void computeAllowanceTest1() throws InvalidSalaryException {
		employee.setBasicSalary(10000.00);
		
		double expectedSalary=2000.00;
		double actualSalary=employee.computeAllowance();
		assertEquals(expectedSalary,actualSalary);
	}
	
	@Test
	@DisplayName("Allowance testing with Postitive Number2")
	public void computeAllowanceTest2() throws InvalidSalaryException {
		employee.setBasicSalary(40000.00);
		
		double expectedSalary=8000.00;
		double actualSalary=employee.computeAllowance();
		assertEquals(expectedSalary,actualSalary);
	}
	
	@Test
	@DisplayName("Allowance testing with Negative Number1")
	public void computeAllowanceTest3() {
		Exception ex=assertThrows(InvalidSalaryException.class, ()->this.employee.setBasicSalary(-40000));
		assertEquals("Salary cannot be a negative value",ex.getMessage());
	}
	
	@Test
	@DisplayName("Allowance testing with Negative Number2")
	public void computeAllowanceTest4() {
		Exception ex=assertThrows(InvalidSalaryException.class, ()->this.employee.setBasicSalary(-50000));
		assertEquals("Salary cannot be a negative value",ex.getMessage());
	}	
	
	@AfterEach
	public void destroy() {
		employee=null;
		System.out.println("......init after test......");
		System.out.println("\t<<<<>>>>>");
	}
}
