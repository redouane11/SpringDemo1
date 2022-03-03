package com.redouaneadr.springdemo;

public class FootballCoach implements Coach{
 
	// Define a private field for dependency
	private Team team;
	public FootballCoach(Team theTeam) {
		team = theTeam;
	}
	@Override
	public String getDailyWorkout() {
		
		return "DO 30 minutes warmup";
	}

	@Override
public String getTeam() {
		
		// use team to get the decide the training 
		return team.GetTeam();
	}

}
