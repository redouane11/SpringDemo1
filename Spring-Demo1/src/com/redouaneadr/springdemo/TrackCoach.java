package com.redouaneadr.springdemo;

public class TrackCoach implements Coach {
	
	// Define a private field for dependency
	private Team team;
	
	public TrackCoach(Team theTeam) {
		System.out.print("constructor TrackCoach");
		team = theTeam;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getTeam() {
		
		// use team to get the decide the training 
		return team.GetTeam();
	}

}
