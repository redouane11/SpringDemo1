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


## Spring Dependecy Injection:
1. Constructor Injection: 
The Team Object now is required to start a training session, The Coach neads a team to start a session type (Team is Complete or incomplete).
I Added The DEpendency Injection in ConfigFile and in the Coachs constructors.

Run HelloSpringApp where the FootballCoach bean is created and the team bean is Injected in the constructor.


2. Setter Injection
Run SetterDemoApp where the BaseballCoach bean is created and the team bean is Injected in the the Setter.

3. Literal values Injection
Adding geters and setter in a class, add properties and value in the configFile

```xml
<!--Inject literal value setter injection -->
		<property name="teamName" value="Chelsea"></property>
		<property name="coachName" value="Morinho"></property>
```

4. Injection Values from a properties file:		
     Create a properties file and load it int the configFile
     ```xml
	<!--Load a propertie file-->
        <context:property-placeholder location="classpath:/cosch.properties"/>
    ```
***

___What is Singleton?___
1. Spring container will create only **one bean instance, by default**.
2. It is cached in memory.
3. All requests for the bean will return a SHARED reference to the same bean.

We can explicitly change the scope of the bean in the configFile. For example we change here the Singleton default scope to be the prototype scope:

```xml
	<bean id="ACoach"
		class="com.redouaneadr.springdemo.FootballCoach"
		scope="prototype"
	      >
	</bean>
```
		
***

___Bean lifecyle Methods/Hooks:___
1. We can add custom code during bean initialization 
	1. Calling custom business logic methods,
	2. Setting up handles to ressources (db connection, sockets, file ...etc.) 
2. We can add custom code during bean destruction 
	1. Calling custom business logic methods,
	2. Clean up handles to ressources (db connection, sockets, file ...etc.) 
	
```xml
<bean id="ACoach"
		class="com.redouaneadr.springdemo.FootballCoach"
		scope="prototype"
      		init-method="doStartupthing"
      		destroy-method="DoCleanupthing"
      >
	</bean>

```
***

___Spring Annotations:___

1. Add entry to enable component scanning in the config file:
```xml
	<context:component-scan base-package="com.redouaneadr.springdemo"></context:component-scan>
```
2. Add **@Component("NameofyourBeanID")** for explicit explicit naming

* *Note: If we remove the beanId from the @component, Spring will use the the default beanId, which is the class name with lowercase in the first letter.* *
