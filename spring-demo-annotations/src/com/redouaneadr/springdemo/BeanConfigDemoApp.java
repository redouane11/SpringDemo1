package com.redouaneadr.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PremiereLeague.class);
		
		// get the bean from spring container
		
		Team theTeam = context.getBean("liverpoolTeam",Team.class);
		
		// call a method on the bean
		
		System.out.println(theTeam.getTeamUpdates());
		
		System.out.println("\n" + theTeam.getNewlyPlayer());
		
		System.out.println("\n" + theTeam.getTeamCoach());

		// close the context
		
		context.close();
	}

}
