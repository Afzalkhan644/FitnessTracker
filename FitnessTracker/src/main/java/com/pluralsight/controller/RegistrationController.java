package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pluralsight.model.User;

@Controller
public class RegistrationController {

@RequestMapping(value ="Register")
public String RegisterUser(User user) {


return "Register";
}
}