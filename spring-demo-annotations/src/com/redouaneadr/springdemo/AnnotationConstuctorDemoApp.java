package com.redouaneadr.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConstuctorDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		
		Team theTeam = context.getBean("chelsea",Team.class);
		
		
		
		// call a method on the bean
		
		
		
		System.out.println(theTeam.getTeamUpdates());
		
		System.out.println("\n" + theTeam.getNewlyPlayer());
		
		System.out.println("\n" + theTeam.getTeamCoach());
		

		// close the context
		
		context.close();
	}

}
