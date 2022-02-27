package com.zensar.training;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Bill;
import com.zensar.training.bean.BillItem;
import com.zensar.training.util.JPAUtil;


public class Main4 {

	public static void main(String[] args) {
		Bill bill=new Bill();
		bill.setCustomerName("Jack");
		bill.setBillDate(LocalDate.of(2021, 8,4));
		
		BillItem billItem1=new BillItem();
		billItem1.setProductName("Pen");
		billItem1.setPrice(12.5);
		billItem1.setQuantity(3);
		
		BillItem billItem2=new BillItem();
		billItem2.setProductName("Crayon");
		billItem2.setPrice(10.5);
		billItem2.setQuantity(2);
		
		BillItem billItem3=new BillItem();
		billItem3.setProductName("Pencil");
		billItem3.setPrice(5.5);
		billItem3.setQuantity(5);
		
		bill.addBillItem(billItem1);
		bill.addBillItem(billItem2);
		bill.addBillItem(billItem3);
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(bill);
		em.getTransaction().commit();
		
		JPAUtil.shutDown();

	}

}
