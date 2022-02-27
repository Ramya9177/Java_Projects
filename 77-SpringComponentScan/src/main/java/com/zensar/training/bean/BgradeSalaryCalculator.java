package com.zensar.training.bean;

import org.springframework.stereotype.Component;

@Component(value="bGradSalCal")
public class BgradeSalaryCalculator implements SalaryCalculator {
	@Override
	public double computeAllowance(double basic) {
		
		return basic*0.30;
	}

	@Override
	public double computeTax(double basic) {
		
		return  basic*0.10;
	}
}
