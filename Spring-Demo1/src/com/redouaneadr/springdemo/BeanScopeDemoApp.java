package com.redouaneadr.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// Load the Spring Configuration file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
				//retrieve bean from spring Container
				
				Coach theCoach= context.getBean("ACoach", Coach.class);
				Coach theCoach2= context.getBean("ACoach", Coach.class);
				//call methods on the bean
				System.out.println(theCoach.getDailyWorkout());
				System.out.println(theCoach.equals(theCoach2));
				System.out.println("\nMemory location for the theCoach: " + theCoach);
				System.out.println("Memory location for the theCoach: " + theCoach2);
				
				//let's call our new method for team
				
				
				
				
				
				//close the context
				
				context.close();
	}

}
