package com.redouaneadr.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:liverpool.properties")
public class Liverpool implements Team {
	
	private Player player;
	
	@Value("Salah")
	private String playerName;
	
	@Value("Jurgen Klupp")
	private String managerName;
	
	
	public Liverpool(Player player) {
		this.player = player;
	}

	@Override
	public String getTeamUpdates() {
		// TODO Auto-generated method stub
		return "Liverpool --> You will never walk alone!";
	}

	@Override
	public String getNewlyPlayer() {
		// TODO Auto-generated method stub
		return "Liverpool ----> "+ playerName + " "+ player.getPlayer();
	}

	@Override
	public String getTeamCoach() {
		// TODO Auto-generated method stub
		return "Manager ---> " + managerName;
	}

}
