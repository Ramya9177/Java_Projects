package com.zensar.training;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zensar.training.bean.SimpleCalculator;

public class SimpleCalculatorTest {

	SimpleCalculator calculator;
	
	@BeforeAll
	public static void init0() {
		System.out.println("class loading");
	}
	@AfterAll
	public static void delete() {
		System.out.println("deleting...class");
	}
	
	@BeforeEach
	public void init() {
		calculator=new SimpleCalculator();
		System.out.println("init........");
	}
	@Test
	public void testingAddFunction() {
		
		int expectedResult=30;
		int actual=calculator.add(10,20);
		assertEquals(expectedResult, actual);
}
	@Test
	public void testingMultiply() {
		
		int expectedResult=10;
		int actual=calculator.multiply(5,2);
		assertEquals(expectedResult, actual);
	
		
	}
	@Test
	public void testingSubstract() {
		
		int expectedResult=3;
		int actual=calculator.substract(5,2);
		assertEquals(expectedResult, actual);
		
		
	}
	@Test
	public void testingDivide() {
		
		int expectedResult=5;
		int actual=calculator.divide(10,2);
		assertEquals(expectedResult, actual);
		
		
	}
	@AfterEach
	public void destroy() {
		calculator=null;
		System.out.println("deleting.......");
	}
}
