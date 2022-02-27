package com.zensar.training;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.zensar.training.bean.Address;
import com.zensar.training.bean.Employee;
import com.zensar.training.util.HibernateUtil;


public class Main {

	static void insert(){
		HibernateUtil.init();
		
		Session session=HibernateUtil.getSession();
		
		Transaction tx=session.beginTransaction();
		
		Address address=new Address();
		address.setDoorNumber("A4");
		address.setAreaName("SriSai Colony");
		address.setCityName("Warangal");
		
		Employee employee=new Employee("Sudheer", 25000.00, address);
		
		session.save(employee);
		
		tx.commit();
		
		HibernateUtil.cleanUp();
	}
		static void readAll() {
			HibernateUtil.init();
			Session session=HibernateUtil.getSession();
			
			String str="from Employee";//HQL Query
			
			Query query=session.createQuery(str);
			List<Employee> allEmployees=query.list();
			System.out.println(allEmployees);
			
			HibernateUtil.cleanUp();
			
		}
	
	
	public static void main(String[] args) {
		//insert();
		readAll();
	}
}
