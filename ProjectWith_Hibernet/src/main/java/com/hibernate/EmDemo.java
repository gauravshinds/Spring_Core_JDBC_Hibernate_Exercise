package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		/*
		 * First student
		 */
		Student st = new Student();
		st.setId(12);
		st.setName("Gaurav Shinde");
		st.setCity("Pune");
		
		Certificates cer = new Certificates();
		cer.setCourse("Java");
		cer.setDuration("2 months");
		st.setCerti(cer);
		
		/*
		 * Second student
		 */
		Student st1 = new Student();
		st1.setId(13);
		st1.setName("Sumeet Shinde");
		st1.setCity("Pune");
		
		
		Certificates cer1 = new Certificates();
		cer1.setCourse("Android");
		cer1.setDuration("1.5 months");
		st1.setCerti(cer1);
		
		
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(st);
		session.save(st1);
		
		tx.commit();
		session.close();
		factory.close();

	}

}
