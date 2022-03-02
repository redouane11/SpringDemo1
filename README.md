# SpringDemo1
___This is the 1st Spring project to practice how Spring can make the inversion of control by creating an XML configFile.
Create an XML config file to create Beans.___ 

For example this line in the configFile we define a bean: 
```xml
<bean id="ACoach"
		class="com.redouaneadr.springdemo.FootballCoach">
	</bean>
```
Interface: Coach

Classes: TrackCoach, FootballCoach and BaseballCoach implement this interface

1. How to run the project:

Open HelloSpringApp main Class and Run as **Java Application**


```java
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
```



2. To Change the bean type
   1. Open the applicationContext.xml file and replace, just replace the class FootballCoach by BaseballCoach or TrackCoach,
   2. In HelloSpringApp Class, Change your bean accoranly accordantly

