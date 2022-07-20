package com.soturno.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfessorController {

	@GetMapping("/contact-us")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("contact-us");
		return modelAndView;
	}
	
	@GetMapping("/home")
	@PreAuthorize("hasAuthority('PROFESSOR')")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("home");
		return modelAndView;
	}
	
	@GetMapping("/manage-students")
	@PreAuthorize("hasAuthority('PROFESSOR') or hasAuthority('ADMIN')")
	public ModelAndView manageStudents() {
		ModelAndView modelAndView = new ModelAndView("manage-students");
		return modelAndView;
	}
	
	@GetMapping("/access-denied")
	public ModelAndView acessDenied() {
		ModelAndView modelAndView = new ModelAndView("/access-denied");
		return modelAndView;
	}
	
	
}
