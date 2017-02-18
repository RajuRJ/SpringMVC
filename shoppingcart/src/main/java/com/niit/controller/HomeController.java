package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView showHomePage()
	{
		System.out.println("Starting the method showHomePage");
		ModelAndView mv = new ModelAndView ("/HomePage");
		mv.addObject("msg","WELCOME TO SHOPPING CART");
		return mv;
	}
	@RequestMapping("Login")
	public ModelAndView showLoginPage()
	{
		System.out.println("Clicked on Login Link");
		ModelAndView mv = new ModelAndView ("/Login");
		mv.addObject("isUserClickedLogin","true");
		
		return mv;
	}
	@RequestMapping("Register")
	public ModelAndView showRegisterPage()
	{
		System.out.println("Clicked on Register Link");
		ModelAndView mv = new ModelAndView ("/Register");
		mv.addObject("isUserClickedRegister","true");
		return mv;
   }
	@RequestMapping("validate")
	public ModelAndView validateCredentials(@RequestParam("userID") String id,
			@RequestParam("password") String pwd)
	{
		//Actually you have get the data from DB
		//Temporarily -user->niit password=niit@123
		ModelAndView mv = new ModelAndView ("/HomePage");
		
		if(id.equals("niit") && pwd.equals("niit@123"))
	{
			mv.addObject("loginmsg","valid credentials");
		
	}
		else
		{
			mv.addObject("loginmsg", "Invalid Credentials...please try again");
		}
		return mv;
	}
	
}
