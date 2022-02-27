package com.zensar.training.bean;

import org.springframework.stereotype.Component;

@Component(value="aGradSalCal")
public class AgradeSalaryCalculator implements SalaryCalculator{

	@Override
	public double computeAllowance(double basic) {
		
		return basic*0.40;
	}

	@Override
	public double computeTax(double basic) {
		
		return  basic*0.20;
	}

}
