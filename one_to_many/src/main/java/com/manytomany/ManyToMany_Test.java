package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany_Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/onetomany_manyto_one/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setId(11);
		e1.setName("Ram");
		
		e2.setId(22);
		e2.setName("Shyam");
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setPid(101);
		p1.setName("PI Management");
		
		p2.setPid(102);
		p2.setName("SMS Management");
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		
		List<Project> pr = new ArrayList<Project>();
		pr.add(p1);
		pr.add(p2);
		
		
		e1.setProject(pr);
		p2.setEmp(emp);
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		
		session.close();
		factory.close();
	}

}
