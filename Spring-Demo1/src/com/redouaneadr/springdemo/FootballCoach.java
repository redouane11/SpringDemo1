package com.redouaneadr.springdemo;

public class FootballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		
		return "DO 30 minutes warmup";
	}

}
