package com.springcore.constructor;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private List<String> addresses;
	private Certificate cer;
	
	public Person(String name, int personId, List<String> addresses, Certificate cer) {
		super();
		this.name = name;
		this.personId = personId;
		this.addresses = addresses;
		this.cer = cer;
	}

	@Override
	public String toString() {
		return this.name+":"+this.personId+":"+this.addresses+"{"+this.cer.name+"}";
	}
	
	

}
