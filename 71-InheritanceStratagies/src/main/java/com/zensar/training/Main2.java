package com.zensar.training;

import java.util.Date;

import javax.persistence.EntityManager;

import com.zensar.training.bean.pack2.CarLoan;
import com.zensar.training.bean.pack2.HomeLoan;
import com.zensar.training.bean.pack2.Loan;
import com.zensar.training.util.JPAUtil;

public class Main2 {
	
	static void insert() {
		Loan loan=new Loan();
		loan.setLoanId(103);
		loan.setCustomerName("Ram");
		loan.setLoanAmt(10000.00);
		loan.setLoanDate(new Date());
		
		CarLoan carLoan=new CarLoan();
		carLoan.setLoanId(104);
		carLoan.setCustomerName("Raghu");
		carLoan.setLoanAmt(200000.00);
		carLoan.setLoanDate(new Date());
		carLoan.setCarDetails("kL-12 33445");
		carLoan.setRegisteredState("Kerala");
		
		HomeLoan homeLoan=new HomeLoan();
		homeLoan.setLoanId(105);
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
