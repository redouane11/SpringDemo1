package com.redouaneadr.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// Create the object
		
		
		Coach theCoach = new BaseballCoach();
		System.out.println(theCoach.getDailyWorkout());
		
		 theCoach = new TrackCoach();
		// Use the object
		System.out.println(theCoach.getDailyWorkout());

	}

}
