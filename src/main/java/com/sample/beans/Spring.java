package com.sample.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Spring implements Courses {

	@Override
	public boolean selectCourse(double amount) {
		System.out.println("You are Registered for Spring Course");
		System.out.println("Amount paid: "+ amount);
		return true;
	}

}
