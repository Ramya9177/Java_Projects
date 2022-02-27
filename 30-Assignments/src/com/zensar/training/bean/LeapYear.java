package com.zensar.training.bean;

public class LeapYear {
	
	int year;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isLeapYear() {
		if(year%400==0) 
			return true;
		else if(year%100==0)
			return true;
		else if(year%4==0)
			return true;
		else
			return false;
	}

}
