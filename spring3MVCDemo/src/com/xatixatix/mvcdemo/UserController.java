package com.xatixatix.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		User theUser = new User();
		theModel.addAttribute("user",theUser);
		return "user-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("user") User theUser) {
		return "user-confirmation";
	}
}
