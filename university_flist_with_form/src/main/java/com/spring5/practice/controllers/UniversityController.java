package com.spring5.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring5.practice.model.University;
import com.spring5.practice.service.UniversityService;

@Controller
public class UniversityController {

		@Autowired 
		UniversityService universityService;
				
		@GetMapping("/versity/add")
		public String addCourse_GET(Model model) {
			model.addAttribute("universities", new University());
			model.addAttribute("message", "Please add a University");
			return "versity/add";
		}

		@PostMapping("/versity/add")
		public String addCourse(Model model, @ModelAttribute(name = "universities") University university) {
			universityService.addCourse(university);
			model.addAttribute("universities", "University added successfully");
			return "redirect:/versity/show-all";
		}
		
		@GetMapping("/versity/show-all")
		public String showAllCourse(Model model) {
			model.addAttribute("university_list",universityService.getAllUniversity());
			model.addAttribute("message","Showing all universities...");
			
			return "versity/show-all";
		}
		
		
		
	
}
