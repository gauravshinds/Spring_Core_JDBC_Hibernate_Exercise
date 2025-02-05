package com.hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		/*
		 * Creating Question
		 * 
		 */
		Question q1 = new Question();
		q1.setId(1);
		q1.setQuestion("What is Java");
		
		Answer answer = new Answer();
		answer.setAnswerId(11);
		answer.setAnswer("Java is purly OOPS language");
		answer.setQuestion(q1);
		q1.setAnswer(answer);
		
		
		
		Question q2 = new Question();
		q2.setId(2);
		q2.setQuestion("What is API");
		
		Answer answer2 = new Answer();
		answer2.setAnswerId(12);
		answer2.setAnswer("Its application programming interface");
		answer2.setQuestion(q2);
		q2.setAnswer(answer2);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(q1);
		session.save(answer);
		session.save(q2);
		session.save(answer2);
		
		tx.commit();
		
		/*
		 * Fetching data
		 */
		
		Question ques = (Question)session.get(Question.class, 1);
		System.out.println(ques.getQuestion());
		System.out.println(ques.getAnswer().getAnswer());
		
		session.close();
		factory.close();

	}

}
