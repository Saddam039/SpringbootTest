package com.saddam.demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.saddam.demo.Person;

@Controller
public class PersonController {
	
	@RequestMapping("/")
	public String showForm() {
		return "index";
	}
	
	@RequestMapping(value="person")
	public ModelAndView showPerson(@Valid @ModelAttribute Person person) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj", person);
		mv.setViewName("show");
		return mv;
	}
	
}
