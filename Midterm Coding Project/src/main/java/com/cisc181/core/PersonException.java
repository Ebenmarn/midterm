package com.cisc181.core;
import java.util.Date;

public class PersonException extends Exception{

private Person person;
	
	public PersonException(Person p) {
		this.person = p;
	}
	
	public Person getP() {
		return person;
	}
}
   

 
}