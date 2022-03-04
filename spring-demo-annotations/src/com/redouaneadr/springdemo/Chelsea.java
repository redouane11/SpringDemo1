package com.redouaneadr.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chelsea implements Team{
	@Value("Chelsea")
	private String name;
	
	
	
	private Player newPlayer;
	private Coach coach;
	
	public Chelsea() {
		
	}
	
	/*
	@Autowired
	public Chelsea(Coach coach) {
		this.newPlayer = newPlayer;
	}
	*/
	
	

	@Autowired
	public void setExtendedContract(@Qualifier("striker") Player oldPlayer) {
		newPlayer = oldPlayer;
	}
	@Autowired
	public void setTeamCoach( Coach coach) {
		this.coach = coach;
	}
	
	@Override
	public String getTeamUpdates() {
		
		return "\n" + name +"---> We are 2021 Champions league!!";
	}
	@Override
	public String getNewlyPlayer() {
		
		return newPlayer.getPlayer() + name;
	}

	@Override
	public String getTeamCoach() {
		return name +coach.getCoach();
	}
	
	
		
}
