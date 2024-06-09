package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sample.beans.Study;

import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		Study obj = context.getBean(Study.class);
		boolean b = obj.select(5500);
		
		if(b == true) {
			System.out.println("Thank You for registering with us");
		}
		
		else {
			System.out.println("You are not registered because of some error");
		}
	}

}
