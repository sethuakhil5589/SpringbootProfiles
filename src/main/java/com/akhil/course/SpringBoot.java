package com.akhil.course;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SpringBoot implements Course {

	@Override
	public boolean courseRegistration(double price) {
		System.out.println("Springboot Course Registration Successful with amount: "+price);
		return true;
	}

}
