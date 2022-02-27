package com.zensar.training.bean;

import java.io.IOException;

public class AGradesalaryCalculator implements SalaryCalculator{

	@Override
	public double computeAllowance(double basic) throws Exception {
		if(basic<0) {
			IOException exception =new IOException("Ivalid Basic");
			throw exception;
		}
		return 0;
	}

}
