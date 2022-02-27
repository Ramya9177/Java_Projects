package com.zensar.training;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;
import com.zensar.training.util.HibernateUtil;

public class App 
{
	
	static void insert() {
		Employee employee=new Employee("Raghu",LocalDate.of(200,1,14),3000,Gender.MALE);
		
		HibernateUtil.init();
		
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(employee);
		tx.commit();
		HibernateUtil.cleanup();
	}
	static void read() {
		HibernateUtil.init();
		
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		Employee employee=session.load(Employee.class, 2);
		System.out.println(employee);
		
		HibernateUtil.cleanup();
		
	}
	static void readAll() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		String str="from Employee";//HQL Query
		
		Query query=session.createQuery(str);
		List<Employee> allEmployees=query.list();
		System.out.println(allEmployees);
		
		HibernateUtil.cleanup();
		
	}
	static void update() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Employee employee=session.load(Employee.class,6);
		employee.setName("Raghu");
		employee.setName(employee.getName().toLowerCase());
		employee.setBasicSalary(35000);
		
		Transaction tx=session.beginTransaction();
		
		session.update(employee);
		
		tx.commit();
		HibernateUtil.cleanup();
		
	}
	static void delete() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Employee employee=session.load(Employee.class,4);
		
		Transaction tx=session.beginTransaction();
		
		session.delete(employee);
		
		tx.commit();
		
		HibernateUtil.cleanup();
		
	}
    public static void main( String[] args )
    {
       //insert();
       // read();
       // readAll();
        update();
       //delete();
    }
}
