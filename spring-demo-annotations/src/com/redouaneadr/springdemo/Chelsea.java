package com.redouaneadr.springdemo;

import org.springframework.stereotype.Component;

@Component("teamChelsea")
public class Chelsea implements Team{

	@Override
	public String getTeamUpdates() {
		
		return "\nChelsea ---> We are 2021 Champions league!!";
	}

}
