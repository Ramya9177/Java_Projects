package com.zensar.training.bean.pack3;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="carloans_30")
@Inheritance(strategy=InheritanceType.JOINED)
public class CarLoan extends Loan {
	
	String carDetails;
	String registeredState;
	
	public String getCarDetails() {
		return carDetails;
	}
	public void setCarDetails(String carDetails) {
		this.carDetails = carDetails;
	}
	public String getRegisteredState() {
		return registeredState;
	}
	public void setRegisteredState(String registeredState) {
		this.registeredState = registeredState;
	}
	@Override
	public String toString() {
		return "CarLoan [carDetails=" + carDetails + ", registeredState="
				+ registeredState + ", toString()=" + super.toString() + "]";
	}
}
