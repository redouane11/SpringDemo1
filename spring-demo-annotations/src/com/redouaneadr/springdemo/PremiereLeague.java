package com.redouaneadr.springdemo;



import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan("com.redouaneadr.springdemo")
public class PremiereLeague {
	
	// define bean for the player (striker) ;
	@Bean
	public Player getSrikerUpdate() {
		return new Striker();
	}
	
	
	//define bean for for Chelsea AND inject dependency
	@Bean
	public Team liverpoolTeam() {
		
		return new Liverpool(getSrikerUpdate());
	}

}
