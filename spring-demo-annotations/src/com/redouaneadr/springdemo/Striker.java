package com.redouaneadr.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Striker implements Player {

	@Override
	public String getPlayer() {
		
		return "New Striker has Singed for ";
	}

}
