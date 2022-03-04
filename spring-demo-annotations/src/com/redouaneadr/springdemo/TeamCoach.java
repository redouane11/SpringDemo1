package com.redouaneadr.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TeamCoach implements Coach {

	@Override
	public String getCoach() {
		
		return "head coach Thomas Tuchel.";
	}

}
