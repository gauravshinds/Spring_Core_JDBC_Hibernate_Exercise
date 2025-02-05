package com.springcore.annotation.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/annotation/stereotype/annotationconfig.xml");

		Person per = context.getBean("person", Person.class);
		System.out.println(per);
	}

}
