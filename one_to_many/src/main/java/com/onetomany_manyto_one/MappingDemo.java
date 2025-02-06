package com.onetomany_manyto_one;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("com/onetomany_manyto_one/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		/*
		 * Creating Question
		 * 
		 */
		Question q1 = new Question();
		q1.setId(1);
		q1.setQuestion("What is Java");
		
		Answer answer1 = new Answer();
		answer1.setAnswerId(11);
		answer1.setAnswer("Java is purly OOPS language");
		answer1.setQuestion(q1);
		
		Answer answer2 = new Answer();
		answer2.setAnswerId(12);
		answer2.setAnswer("Without Object we cant run program");
		answer2.setQuestion(q1);
		
		Answer answer3 = new Answer();
		answer3.setAnswerId(13);
		answer3.setAnswer("Very Secured language");
		answer3.setQuestion(q1);
		
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(answer1);
		list.add(answer2);
		list.add(answer3);
		q1.setAnswers(list);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(answer1);
		session.save(answer2);
		session.save(answer3);
		
		tx.commit();
		
		/*
		 * Fetching data
		 */
		
		Question ques = (Question)session.get(Question.class, 1);
		System.out.println(ques.getQuestion());
		for(Answer a:ques.getAnswers()) {
			System.out.println(a.getAnswer());
		}
		
		session.close();
		factory.close();

	}

}
