package com.redouaneadr.springdemo;

public class BaseballCoach implements Coach{
	
	// Define a private field for dependency
		private Team team;
		
		public BaseballCoach() {
			System.out.println("Baseball coach is absent.. no-arg constructor");
		}
		
		// Our setter Method
		public void setTeam(Team team) {
			System.out.println("this is from the setter method");
			this.team = team;
		}



		@Override
		public String getDailyWorkout() {
			
			return "Basball --> Spend 30 minutes on batting practice";
		}

		@Override
		public String getTeam() {
			
			// use team to get the decide the training 
			return team.GetTeam();
		}
}
