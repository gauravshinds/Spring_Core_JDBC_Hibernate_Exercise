package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJava {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		//Student stu = context.getBean("student", Student.class);
		
		Student stu = context.getBean("getStudent", Student.class);
		
		System.out.println(stu);
		
		stu.study();
		
		
		/*
		 * Bean configuration can be done using 
		 *  - @Bean
		 *  - @Component
		 *  
		 * If you dont pass value in @Component then IOC create bean name by default using class name in small later
		 *  - e.g. class name Student then - student
		 *  
		 * If you pass value in @Component("studentinfo") then value should be beand name while creating objetc  
		 *  
		 * 
		 */
		

	}

}
