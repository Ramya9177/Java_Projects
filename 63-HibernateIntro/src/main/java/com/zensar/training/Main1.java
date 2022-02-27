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

public class Main1 {
	static void insert() {
		Contact contact= new Contact("virat",31,"8340715432");
		
		ServiceRegistry registry;
		SessionFactory sessionFactory;
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metaSources = new MetadataSources(registry);
		Metadata metaData = metaSources.getMetadataBuilder().build();
		sessionFactory=metaData.getSessionFactoryBuilder().build();
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(contact);
		tx.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Contact Saved to DB..!");
		
	}
	static void read() {
		ServiceRegistry registry;
		SessionFactory sessionFactory;
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metaSources = new MetadataSources(registry);
		Metadata metaData = metaSources.getMetadataBuilder().build();
		sessionFactory=metaData.getSessionFactoryBuilder().build();
		
		Session session=sessionFactory.openSession();
		
		Contact contact=session.load(Contact.class, 3);
		System.out.println(contact);
		
		session.close();
		sessionFactory.close();
	}
	static void readAll() {
		ServiceRegistry registry;
		SessionFactory sessionFactory;
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metaSources = new MetadataSources(registry);
		Metadata metaData = metaSources.getMetadataBuilder().build();
		sessionFactory=metaData.getSessionFactoryBuilder().build();
		Session session=sessionFactory.openSession();
		
		String str="from Contact";//HQL Query
		
		Query query=session.createQuery(str);
		List<Contact> allContacts=query.list();
		System.out.println(allContacts);
		
		session.close();
		sessionFactory.close();
		}
	
   static void update() {
	    ServiceRegistry registry;
		SessionFactory sessionFactory;
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metaSources = new MetadataSources(registry);
		Metadata metaData = metaSources.getMetadataBuilder().build();
		sessionFactory=metaData.getSessionFactoryBuilder().build();
		Session session=sessionFactory.openSession();
		
		Contact contact=session.load(Contact.class,3);
		contact.setName("Ramya");
		contact.setName(contact.getName().toLowerCase());
		contact.setAge(49);
		contact.setPhone("939011236");
		
		Transaction tx=session.beginTransaction();
		
		session.update(contact);
		
		tx.commit();
		session.close();
		sessionFactory.close();
	}
   static void delete() {
	   ServiceRegistry registry;
		SessionFactory sessionFactory;
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metaSources = new MetadataSources(registry);
		Metadata metaData = metaSources.getMetadataBuilder().build();
		sessionFactory=metaData.getSessionFactoryBuilder().build();
		Session session=sessionFactory.openSession();
		
		Contact contact=session.load(Contact.class,3);
		
		Transaction tx=session.beginTransaction();
		
		session.delete(contact);
		
		tx.commit();
		
		session.close();
		sessionFactory.close();
	   
   }

	public static void main(String[] args) {
		//insert();//read();
		//readAll();
		//update();
		delete();
	}

}
