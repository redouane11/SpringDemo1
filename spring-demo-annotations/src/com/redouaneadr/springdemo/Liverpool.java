package com.redouaneadr.springdemo;

public class Liverpool implements Team {
	
	private Player player;
	
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
		return "Liverpool ----> SALAH "+player.getPlayer();
	}

	@Override
	public String getTeamCoach() {
		// TODO Auto-generated method stub
		return "Manager ---> Jurgen Klopp";
	}

}
