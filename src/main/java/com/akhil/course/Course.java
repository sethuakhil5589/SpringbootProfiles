package com.akhil.course;

import org.springframework.stereotype.Component;

@Component
public interface Course {
	boolean courseRegistration(double price);
}
