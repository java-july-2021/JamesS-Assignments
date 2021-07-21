package com.james.HelloHuman.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam; 

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(@RequestParam(value ="q", required = false) String searchQuery, Model model) {
		model.addAttribute("search", searchQuery);
		return "index.jsp";
	}
	
	@RequestMapping("/users/{name}")
	public String showName(@PathVariable("name") String userName, Model model) {
		model.addAttribute("user", userName);
		return "index.jsp";
	}

}
