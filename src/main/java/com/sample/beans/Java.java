package com.sample.beans;

import org.springframework.stereotype.Component;

@Component
public class Java implements Courses {

	@Override
	public boolean selectCourse(double amount) {
		
		System.out.println("You are Registered for Java Course");
		System.out.println("Amount paid: "+ amount);
		return true;
	}

}
