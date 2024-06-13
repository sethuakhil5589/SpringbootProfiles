package com.akhil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.akhil.course.Course;

@SpringBootApplication
public class SpringBootProfilesApplication implements CommandLineRunner{
	
	@Value("${myproject.name}")
	private String projectName;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesApplication.class, args);
	}
	
	@Autowired
	Course course;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(projectName);
		course.courseRegistration(2000);
	}

}
