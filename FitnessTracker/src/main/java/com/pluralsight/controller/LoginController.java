package com.pluralsight.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pluralsight.model.User;
import com.pluralsight.service.UserService;
import com.pluralsight.service.UserServiceImpl;

@Controller

public class LoginController  {


@RequestMapping(value ="/Login", method = RequestMethod.GET)

public String Login(Model model) {
	User user = new User();

	model.addAttribute("name", user);
	model.addAttribute("password",user);
	
	return "Login";
}

@RequestMapping(value = "/Login", method = RequestMethod.POST)
public String updateGoal(@Valid @ModelAttribute("User") User user, BindingResult result) {
	
	System.out.println("result has errors: " + result.hasErrors());
	
	System.out.println("User set: " + user.getName());
	
	if(result.hasErrors()) {
		return "/Login";
	}else
	{
		UserService userService=(UserService) new UserServiceImpl();
		userService.Login(user);
		
		;
		
	}
	
	return "redirect:index.jsp";
}
	
}
