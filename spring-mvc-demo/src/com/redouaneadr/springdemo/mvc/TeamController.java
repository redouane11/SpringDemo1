package com.redouaneadr.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/team")
public class TeamController {
	
	// need a controller method to show the inital form
	@RequestMapping("/showForm")
	public String showForm() {
		return "team-form";
	}
	
	
	/*
	// need a controller top process the HTML form
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		String team =  request.getParameter("teamName").toUpperCase();
		
		System.out.println(team);
		model.addAttribute("message", team);
		return "form-process";
	}
	*/
	
	
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("teamName") String teamName, Model model) {
		
		
		System.out.println(teamName);
		model.addAttribute("message", "Welcom to " +  teamName.toUpperCase());
		return "form-process";
	}

}
