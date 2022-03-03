package com.redouaneadr.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// Load the Spring Configuration file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				//retrieve bean from spring Container
				
				Coach theCoach= context.getBean("myBaseballCoach", Coach.class);
				//call methods on the bean
				System.out.println(theCoach.getDailyWorkout());
				
				
				//let's call our new method for team
				System.out.println(theCoach.getTeam());
				//close the context
				
				
				context.close();
	}

}
