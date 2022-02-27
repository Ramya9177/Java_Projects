package com.zensar.training.ui;

import com.zensar.training.bean.SalaryCalculator;

public class Main2 {
	public static void main(String[] args) {
		SalaryCalculator calculator;
		calculator=new SalaryCalculator() {
			
			@Override
			public double computeTax(double basic) {
				// TODO Auto-generated method stub
				return basic*0.10;
			}
			
			@Override
			public double computeAllowance(double basic) {
				// TODO Auto-generated method stub
				return basic*0.40;
			}
		};
		System.out.println(calculator.computeAllowance(1999.9));
		System.out.println(calculator.computeTax(1000));
		calculator=new SalaryCalculator() {
			
			@Override
			public double computeTax(double basic) {
				// TODO Auto-generated method stub
				return basic*0.06;
			}
			
			@Override
			public double computeAllowance(double basic) {
				// TODO Auto-generated method stub
				return basic*0.30;
			}
		};
		System.out.println("---------");
		System.out.println(calculator.computeAllowance(2399.9));
		System.out.println(calculator.computeTax(1100));
		calculator=new SalaryCalculator() {
			
			@Override
			public double computeTax(double basic) {
				// TODO Auto-generated method stub
				return basic*0.15;
			}
			
			@Override
			public double computeAllowance(double basic) {
				// TODO Auto-generated method stub
				return basic*0.45;
			}
		};
		System.out.println("---------");
		System.out.println(calculator.computeAllowance(2099.9));
		System.out.println(calculator.computeTax(1500));
	}
}
