package com.zensar.training;




import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zensar.training.bean.Calculator;

public class CalculatorTest {
	
	Calculator calculator;
	
	@BeforeEach
	public void init() {
		calculator= new Calculator();
		System.out.println("....init before test......");
	}
	
	@Test
	public void addTestWithPositiveNumbers() {
		calculator.setNumber1(10);
		calculator.setNumber2(20);
		int excepted=30;
		int actual=calculator.sum();
		assertEquals(excepted,actual);
	}
	@Test
	public void addTestWithNegativeNumbers() {
		calculator.setNumber1(-4);
		calculator.setNumber2(6);
		int excepted=2;
		int actual=calculator.sum();
		assertEquals(excepted,actual);
	}
	@Test
	public void differenceTestWithPositiveNumbers() {
		calculator.setNumber1(6);
		calculator.setNumber2(5);
		int excepted=1;
		int actual=calculator.difference();
		assertEquals(excepted,actual);
	}
	@Test
	public void differenceTestWithNegativeNumbers() {
		calculator.setNumber1(-6);
		calculator.setNumber2(-5);
		int excepted=-1;
		int actual=calculator.difference();
		assertEquals(excepted,actual);
	}
	
	@Test
	public void multiplyTestWithpositiveNumbers() {
		calculator.setNumber1(8);
		calculator.setNumber2(5);
		int excepted=40;
		int actual=calculator.product();
		assertEquals(excepted,actual);
	}
	
	@Test
	public void multiplyTestWithNegativeNumbers() {
		calculator.setNumber1(-2);
		calculator.setNumber2(-3);
		int excepted=6;
		int actual=calculator.product();
		assertEquals(excepted,actual);
	}
	
	@Test
	public void divideTestWithpositiveNumbers() {
		calculator.setNumber1(10);
		calculator.setNumber2(2);
		int excepted=5;
		int actual=calculator.divide();
		assertEquals(excepted,actual);
	}
	
	@Test
	public void divideTestWithNegativeNumbers() {
		calculator.setNumber1(-20);
		calculator.setNumber2(-2);
		int excepted=10;
		int actual=calculator.divide();
		assertEquals(excepted,actual);
	}

	@AfterEach
	public void destroy() {
		calculator=null;
		System.out.println("......init after test......");
	}
}
