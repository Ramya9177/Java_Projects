package com.zensar.training;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Doctor;
import com.zensar.training.util.HibernateUtil;

public class Main5 {
	
	static void delete1() {
		String str = "delete from Doctor where id=:id";

		
	}
	static void update1() {
		String str = "update Doctor set fees=:fees where id=:id";

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		

		HibernateUtil.cleanUp();
	}
	public static void main(String[] args) {
		delete1();

	}

}
