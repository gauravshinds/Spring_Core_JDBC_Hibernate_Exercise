package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

public class TestJdbc {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		//JdbcTemplate temp = context.getBean("jdbcTemplate", JdbcTemplate.class);
		
		
		StudentDao stud = context.getBean("studentDao", StudentDao.class);
		Student student = new Student();
		/*
		 * Insert Value into Table
		 */
		student.setId(444);
		student.setName("Adam Gilcrist");
		student.setCity("Sydeny, Australia");
		int result = stud.insert(student);
		System.out.println(result);
		
		//Update Record in the table
//		student.setId(333);
//		student.setName("Sumeet Patel");
//		student.setCity("Ahemdabad, Gujrat");
		
		//student.setId(333);
		
//		int result = stud.delete(333);
//		System.out.println(result);
		
		
		/*
		 * RowMapper to get row record from the table
		 */
//		Student student = stud.getStudent(111);
//		System.out.println(student);
		
		List<Student> s = stud.getAllStudent();
		for(Student s1 : s) {
			System.out.println(s1);
			
		}	

	}

}
