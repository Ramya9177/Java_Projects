package com.zensar.training.bean;

public class Employee {
	String name;
	double basicSalary;
	char grade;
	SalaryCalculator calculator;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
		if (this.grade == 'A')
			this.calculator = new AGradeSalaryCalculator();
		if (this.grade == 'B')
			this.calculator = new BGradeSalaryCalculator();
		if (this.grade == 'C')
			this.calculator = new CGradeSalaryCalculator();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", basicSalary=" + basicSalary + ", grade=" + grade + "]";
	}

	public double getAllowance() {
		double res = this.calculator.computeAllowance(basicSalary);
		return res;
	}

	public double getDeduction() {
		double res = this.calculator.computeTax(basicSalary);
		return res;
	}

}
