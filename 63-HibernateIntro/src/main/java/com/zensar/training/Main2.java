package com.zensar.training;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import com.zensar.training.bean.Contact;
import com.zensar.training.util.HibernateUtil;

public class Main2 {
	
	static void insert() {
		Contact contact= new Contact("ramu",21,"9340798432");
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Transaction tx=session.beginTransaction();
		session.save(contact);
		tx.commit();
		
		HibernateUtil.cleanup();
		System.out.println("Contact Saved to DB..!");
		
	}
	static void read() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Contact contact=session.load(Contact.class, 2);
		System.out.println(contact);
		
		HibernateUtil.cleanup();
	}
	static void readAll() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		String str="from Contact";//HQL Query
		
		Query query=session.createQuery(str);
		List<Contact> allContacts=query.list();
		System.out.println(allContacts);
		
		HibernateUtil.cleanup();
		}
	
   static void update() {
	   HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Contact contact=session.load(Contact.class,4);
		contact.setName("Ram");
		contact.setName(contact.getName().toLowerCase());
		contact.setAge(48);
		contact.setPhone("939011236");
		
		Transaction tx=session.beginTransaction();
		
		session.update(contact);
		
		tx.commit();
		HibernateUtil.cleanup();
	}
	
	public static void delete() {
		    HibernateUtil.init();
			Session session=HibernateUtil.getSession();
			
			Contact contact=session.load(Contact.class,1);
			
			Transaction tx=session.beginTransaction();
			
			session.delete(contact);
			
			tx.commit();
			
			HibernateUtil.cleanup();
		   
	   }
	
	public static void main(String[] args) {
		insert();
		//read();
		//readAll();
		//update();
		//delete();
	}

}
