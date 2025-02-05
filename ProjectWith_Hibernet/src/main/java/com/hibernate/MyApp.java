package com.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyApp {

	public static void main(String[] args) throws IOException {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);
		
		Student student = new Student();
		student.setId(111);
		student.setName("Markva");
		student.setCity("UK");
		
		System.out.println(student);
		
		
		/*
		 * Creating object of Address
		 */
		
		Address add = new Address();
		add.setStreet("Street2");
		add.setCity("PUNE");
		add.setOpen(true);
		add.setAddedDate(new Date());
		add.setX(2356.000);
		System.out.println(add);
		
		
		/*
		 * Image Reading
		 */
		
		try (FileInputStream fis = new FileInputStream("src/main/java/lion.jpg")) {
			byte[] data = new byte[fis.available()];
			fis.read(data);
			add.setImage(data);
		}
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		session.save(add);
		tx.commit();
		session.close();

	}

}
