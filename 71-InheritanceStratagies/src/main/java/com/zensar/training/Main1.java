package com.zensar.training;

import java.util.Date;

import javax.persistence.EntityManager;

import com.zensar.training.bean.pack1.CarLoan;
import com.zensar.training.bean.pack1.HomeLoan;
import com.zensar.training.bean.pack1.Loan;
import com.zensar.training.util.JPAUtil;

public class Main1 {
	
	static void insert() {
		Loan loan=new Loan();
		loan.setCustomerName("Ram");
		loan.setLoanAmt(10000.00);
		loan.setLoanDate(new Date());
		
		CarLoan carLoan=new CarLoan();
		carLoan.setCustomerName("Raghu");
		carLoan.setLoanAmt(200000.00);
		carLoan.setLoanDate(new Date());
		carLoan.setCarDetails("kL-12 33445");
		carLoan.setRegisteredState("Kerala");
		
		HomeLoan homeLoan=new HomeLoan();
		homeLoan.setCustomerName("Raghuvaran");
		homeLoan.setLoanAmt(40000.00);
		homeLoan.setLoanDate(new Date());
		homeLoan.setHomeAddress("F5 wilsom garden ,banglore");
		homeLoan.setOwnedBy("Raghuvaran");
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(loan);
		em.persist(carLoan);
		em.persist(homeLoan);
		
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
	}

	public static void main(String[] args) {
		insert();
	}

}
