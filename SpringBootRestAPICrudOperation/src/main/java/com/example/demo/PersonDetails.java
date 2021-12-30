package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDetails {
	
	@Autowired
	Person persons;
	
	public void showPerson() 
	{
		System.out.println("person id: "+persons.getPersonId()+", "+"person name: " + persons.personName);
	}

}
