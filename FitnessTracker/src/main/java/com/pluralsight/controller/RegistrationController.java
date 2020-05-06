package com.pluralsight.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pluralsight.model.User;

@Controller
public class RegistrationController {

	
	
	
	@RequestMapping(value = "Register", method = RequestMethod.GET)
	public String Register(Model model) {
		User user = new User();

		model.addAttribute("User",user);
		
		return "Register";
	}
	
	
	
	
	
	
	
	
	
@RequestMapping(value ="Register", method = RequestMethod.POST)
public String RegisterUser(@Valid @ModelAttribute("User") User user, BindingResult result) {
		
		System.out.println("result has errors: " + result.hasErrors());
		
		System.out.println("Name set: " + user.getName());
		System.out.println("Name set: " + user.getPassword());
		System.out.println("Name set: " + user.getHeight());
		System.out.println("Name set: " + user.getWeight());
		if(result.hasErrors()) {
			
			return "Register";
		}else
		{
			
		}
		
		return "redirect:index.jsp";
	
}
}