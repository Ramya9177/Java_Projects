package com.zensar.training;

import org.hibernate.Session;

import org.hibernate.Transaction;

import com.zensar.training.bean.Developer;
import com.zensar.training.util.HibernateUtil;

public class Main3 {

	public static void main(String[] args) {
		insertTest();

	}

	static void insertTest() {
		Developer developer=new Developer();
		developer.setName("Ramya");
		developer.setCity("Hyderabad");
		developer.addSkill("HTML");
		developer.addSkill("Angular");
		developer.addSkill("React");
		developer.addSkill("Node Js");
		developer.addSkill("Java");
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(developer);
		tx.commit();
		
		HibernateUtil.cleanUp();
		
	}

}
