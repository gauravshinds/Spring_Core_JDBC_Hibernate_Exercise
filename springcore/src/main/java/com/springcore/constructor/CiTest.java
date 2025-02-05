package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/ciconfig.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
	}
	
	//Spring life cycle
	
	/* Spring provide 2 imp methods to every bean
	 * We can change the method name but signature of the method remain same.
	 * 1. public void init() 	- initialization, code, Loading, config, connection db, Webservices. etc
	 * 2. public void destroy() - Clean up code (e.g. close connection)
	 * 
	 * what is require Spring container what info he require
	 * 
	 * Bean - Nothing but java class
	 * Metadata - configuration file (e.g. xml)
	 * This is happen using init method
	 * Then we can Read and use the bean
	 * Then Destroy method
	 * 
	 * How to call method
	 * Using 
	 * -xml, 
	 * -Spring provide some interface we can use those as well
	 * -Java Annotation 
	 * 
	 */

}
