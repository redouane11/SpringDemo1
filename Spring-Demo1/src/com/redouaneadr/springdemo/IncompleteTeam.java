package com.redouaneadr.springdemo;

import java.util.Random;

public class IncompleteTeam implements Team {
	private String[] reasonIncompleted = {"The Team is incomplete.",
			"There is no Referee.",
			"The rain is so heavy."};
	// create a random number generator
		private Random myRandom = new Random();
	@Override
	public String GetTeam() {
		// pick a random string from the array
		int index = myRandom.nextInt(reasonIncompleted.length);
		String reason = reasonIncompleted[index];
		return reason +" Let's practice shooting...";
	}

}
