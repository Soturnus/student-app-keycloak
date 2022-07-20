package com.soturno.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfessorController {

	@GetMapping("/contact-us")
	public ModelAndView login() {
<<<<<<< HEAD:src/main/java/com/soturno/controller/StudentController.java
		ModelAndView modelAndView = new ModelAndView("contact-us");
=======
		ModelAndView modelAndView = new ModelAndView("/contact-us");
>>>>>>> efe755eee2ea33942c69f035ad09beb26a8e32a7:src/main/java/com/soturno/controller/ProfessorController.java
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
