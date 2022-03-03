package com.redouaneadr.springdemo;

public class IncompleteTeam implements Team {

	@Override
	public String GetTeam() {
	
		return "The team is not complete. Let's practice shooting...";
	}

}
