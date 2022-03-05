package com.redouaneadr.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeamController {
	
	// need a controller method to show the inital form
	@RequestMapping("/showForm")
	public String showForm() {
		return "team-form";
	}
	
	// need a controller top process the HTML form
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		String team =  request.getParameter("teamName").toUpperCase();
		
		System.out.println(team);
		model.addAttribute("message", team);
		return "form-process";
	}
	

}
