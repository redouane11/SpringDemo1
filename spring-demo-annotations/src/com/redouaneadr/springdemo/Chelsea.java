package com.redouaneadr.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chelsea implements Team{
	
	private String name = "Chelsea";
	
	private Player newPlayer;
	
	@Autowired
	public Chelsea(Player newPlayer) {
		this.newPlayer = newPlayer;
	}
	@Override
	public String getTeamUpdates() {
		
		return "\nChelsea ---> We are 2021 Champions league!!";
	}
	@Override
	public String getNewlyPlayer() {
		
		return newPlayer.getPlayer() + name;
	}
	
	
		
}
