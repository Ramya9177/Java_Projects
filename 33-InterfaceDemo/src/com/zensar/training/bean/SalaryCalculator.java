package com.zensar.training.bean;

public interface SalaryCalculator {
	double PI = 3.14;

	double computeAllowance(double basicSalary);

	double computeTax(double basicSalary);

	double computeNetSalary(double basicSalary);

}
