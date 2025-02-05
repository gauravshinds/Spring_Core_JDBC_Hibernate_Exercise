package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		/*
		 * Difference between get() and Load()
		 */
		
//		Student st = (Student)session.get(Student.class, 222);
//		System.out.println(st);
		
		Student st1 = (Student)session.load(Student.class, 222);
		System.out.println(st1);
		
		Address ad = (Address) session.get(Address.class, 2);
		System.out.println(ad.getCity()+":"+ad.getStreet());
		
		
		
		session.close();
		factory.close();
		
		

	}

}
