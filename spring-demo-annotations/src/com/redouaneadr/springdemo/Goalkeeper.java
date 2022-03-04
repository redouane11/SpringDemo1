package com.redouaneadr.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Goalkeeper implements Player {

	@Override
	public String getPlayer() {
		
		return "We extend the contract for Eduard Mendy untill 2030.";
	}

}
