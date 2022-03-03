package com.redouaneadr.springdemo;

public class BaseballCoach implements Coach{
	
	// Define a private field for dependency
		private Team team;
		public BaseballCoach(Team theTeam) {
			team = theTeam;
		}
		@Override
		public String getDailyWorkout() {
			
			return "Spend 30 minutes on batting practice";
		}

		@Override
		public String getTeam() {
			
			// use team to get the decide the training 
			return team.GetTeam();
		}
}
