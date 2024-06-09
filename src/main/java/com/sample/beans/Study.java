package com.sample.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Study {
	
	@Autowired
	@Qualifier("java")
	private Courses course;
	
	public boolean select(double amount) {
		course.selectCourse(amount);
		return true;
	}
}
