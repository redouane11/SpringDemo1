package com.redouaneadr.springdemo.mvc;

//import java.util.Date;

//import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	
	private String firstName = "Redouane";
	private String lastName = "Adriouch";
	//private @DateTimeFormat(pattern="yyyy-MM-dd") Date  birthday;
	
	public Student( ) {}

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
