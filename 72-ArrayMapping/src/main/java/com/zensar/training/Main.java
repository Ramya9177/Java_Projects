package com.zensar.training;

import java.util.List;

import javax.persistence.EntityManager;



import com.zensar.training.bean.Student;
import com.zensar.training.util.JPAUtil;


public class Main {

	public static void main(String[] args) {

		insertTesting();
		// loadTesting(2);

		// loadAllTesting();

		// updateTesting(1);
		// deleteTesting(2);

	}

	private static void insertTesting() {
		Student student = new Student();
		student.setRollNo(5052);
		student.setName("Suresh");
		student.setMark(0,95.55);
		student.setMark(1, 97.00);
		student.setMark(2, 98.55);

		EntityManager em=JPAUtil.createEntityManager("PU");
		
		em.getTransaction().begin();
		em.persist(student);
		
		
		em.getTransaction().commit();
		JPAUtil.shutDown();
		

		System.out.println("Student Object Saved with ID " );
	}

	private static void loadTesting(int id) {
		
	}

	private static void loadAllTesting() {
		
	}

	private static void updateTesting(int id) {

		

	}

	private static void deleteTesting(int id) {
		

	}

}
