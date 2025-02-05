package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {
       //object is creating by spring container so no need to use new keyword, As we know Spring is loosely coupled
       //Using setter injection 
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Student student1 = (Student) context.getBean("student1");
    	System.out.println(student1);
    	
    	Student student2= (Student) context.getBean("student2");
    	System.out.println(student2);
    	
    	Student student3 = (Student) context.getBean("student3");
    	System.out.println(student3);
    	
    	
    }
}
