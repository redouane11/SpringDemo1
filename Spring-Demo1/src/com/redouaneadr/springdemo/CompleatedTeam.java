package com.redouaneadr.springdemo;

public class CompleatedTeam implements Team {
	

	@Override
	public String GetTeam() {
		
		return "The Team is Complete. Let's start a game...";
	}

	
	//Add an init method
	public void getFixtureFirst() {
		System.out.println("\nOur next fixutre is int 2 weeks, let's concentrate from now!");
	}
	public void getTeamPreparationStatus() {
		System.out.println("\nWe believe that we are ready for the next Game!");
	}
}
