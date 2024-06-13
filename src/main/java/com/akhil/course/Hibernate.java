package com.akhil.course;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("springboot")
public class Hibernate implements Course {

	@Override
	public boolean courseRegistration(double price) {
		System.out.println("Hibernate Course Registration Successful with amount: "+price);
		return true;
	}

}
