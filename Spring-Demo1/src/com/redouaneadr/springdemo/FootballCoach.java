package com.redouaneadr.springdemo;

public class FootballCoach implements Coach{
 
	// Define a private field for dependency
	private String coachName;
	private String teamName;
	
	private Team team;
	public FootballCoach() {
		
		System.out.println("Football coatch is absent.. no-arg constructor");
	}
	
	
	public FootballCoach(Team theTeam) {
		System.out.println("Football constructing coach with team");
		team = theTeam;
	}
	
	
	public String getCoachName() {
		return "Your are  trained by: "+coachName;
	}
	
	
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	
	
	public String getTeamName() {
		return "Your are Playing for: "+teamName+" FC";
	}
	
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	
	@Override
	public String getDailyWorkout() {
		
		return "Football --> DO 30 minutes warmup";
	}

	@Override
	public String getTeam() {
		
		// use team to get the decide the training 
		return team.GetTeam();
	}

}
