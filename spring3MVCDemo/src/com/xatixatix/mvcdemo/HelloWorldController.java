package com.xatixatix.mvcdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/mainMenu")
	public String mainMenu() {
		return "main-menu";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormToUppercase")
	public String dataToUppercase(HttpServletRequest request, Model model) {
		model.addAttribute("message",request.getParameter("userName").toUpperCase());
		return "helloworld";
	}
	
	@RequestMapping("/processFormToUppercaseV2")
	public String dataToUppercasev2(@RequestParam("userName") String name, Model model) {
		model.addAttribute("message",name.toUpperCase());
		return "helloworld";
	}
}
