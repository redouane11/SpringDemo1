package com.redouaneadr.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring Container
		
		Coach theCoach= context.getBean("ACoach", Coach.class);
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		
		
		context.close();

	}

}
