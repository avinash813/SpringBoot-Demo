package com.sample.beans;

import org.springframework.stereotype.Component;

@Component
public class Hibernate implements Courses {

	@Override
	public boolean selectCourse(double amount) {
		System.out.println("You are Registered for Hibernate Course");
		System.out.println("Amount paid: "+ amount);
		return true;
	}

}
