package com.zensar.training.ui;

import com.zensar.training.bean.SalaryCalculator;
import com.zensar.training.bean.AGradeSalaryCalculator;
import com.zensar.training.bean.BGradeSalaryCalculator;
import com.zensar.training.bean.CGradeSalaryCalculator;

public class Main1 {

	public static void main(String[] args) {
		SalaryCalculator calculator;
		calculator =new AGradeSalaryCalculator();
		
		System.out.println(calculator.computeAllowance(10000));
		System.out.println(calculator.computeTax(10000));
		System.out.println(calculator.computeNetSalary(10000));
		
		
        calculator =new BGradeSalaryCalculator();
		
		System.out.println(calculator.computeAllowance(10000));
		System.out.println(calculator.computeTax(10000));
		System.out.println(calculator.computeNetSalary(10000));
		
        calculator =new CGradeSalaryCalculator();
		
		System.out.println(calculator.computeAllowance(10000));
		System.out.println(calculator.computeTax(10000));
		System.out.println(calculator.computeNetSalary(10000));
		
	}

}
