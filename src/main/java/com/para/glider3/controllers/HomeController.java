package com.para.glider3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	//@RequestMapping(value = "/", method = RequestMethod.GET)
	@GetMapping("/")
	public ModelAndView strona (ModelAndView model){
		model.addObject("start", "Strona startowa testowa");
		model.setViewName("home");
		return model;
		}
	
}
