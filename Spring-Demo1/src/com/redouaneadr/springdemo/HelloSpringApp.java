package com.redouaneadr.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring Container
		
		FootballCoach theCoach= context.getBean("ACoach", FootballCoach.class);
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		//let's call our new method for team
		System.out.println(theCoach.getTeam());
		
		//let's call our new method for FootballCoach
		System.out.println(theCoach.getTeamName());
		System.out.println(theCoach.getCoachName());
		
		//close the context
		
		context.close();

	}

}
