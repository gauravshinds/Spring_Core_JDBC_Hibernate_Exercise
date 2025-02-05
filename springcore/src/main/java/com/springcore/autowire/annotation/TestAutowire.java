package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autowireannotationconfig.xml");
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);
		
		/*
		 * Autowire can be done using
		 * - By Name - Variable name and bean name should be same
		 * - By Type - By type is checking is there type of bean is that available in configuration file
		 * - By Constructor
		 */

	}

}
