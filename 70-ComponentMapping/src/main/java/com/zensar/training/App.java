package com.zensar.training;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.zensar.training.bean.Address;
import com.zensar.training.bean.Employee;
import com.zensar.training.util.JPAUtil;

public class App 
{
	static void insert() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		Address address=new Address("F-5","Vincent colony","Hyderabad");
		Employee employee=new  Employee("Raju",'A',20000.00,LocalDate.of(2021, 4, 1),address);
		
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		
		JPAUtil.shutDown();
	}
	static void read() {
		EntityManager em = JPAUtil.createEntityManager("PU");

		Employee employee = em.find(Employee.class, 4);

		System.out.println(employee);

		JPAUtil.shutDown();
	}
    public static void main( String[] args )
    {
        //insert();
    	read();
    }
}
