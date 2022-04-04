package com.redouaneadr.springdemo.mvc;

import java.util.LinkedHashMap;

//import java.util.Date;

//import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	
	private String firstName = "Redouane";
	private String lastName = "Adriouch";
	private LinkedHashMap<String, String> country; 
	//private @DateTimeFormat(pattern="yyyy-MM-dd") Date  birthday;
	public Student() {
		country = new LinkedHashMap<>();
		country.put("CA", "Canada");
		country.put("Fr", "Franca");
		country.put("MAL", "Malaysia");
		country.put("MOR", "Morocco");
		country.put("GER", "GERMANY");
		country.put("USA", "United States");
	}
	

	


	public LinkedHashMap<String, String> getCountry() {
		return country;
	}





	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	};
	
	

}
