package com.sportyshoes.p3.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sportyshoes.p3.entity.Admin;

@Controller
public class LoginController {

	@GetMapping("/admin")
	public String adminLogin(Model m) {
		
		System.out.println("opening login page");
		m.addAttribute("loginData",new Admin());
		return "admin";
	}
	
	@PostMapping("/process")
	public String ProcessLogin(@Valid @ModelAttribute("loginData") Admin loginData, BindingResult result) {
		String un=loginData.getUname();
		String p = loginData.getPwd();
		
		if(result.hasErrors()) {
			System.out.println(result);
			return "loginfail";
		}
		else if((un.equalsIgnoreCase("admin_101"))&&(p.equalsIgnoreCase("password123")))
		{
		System.out.println(loginData);
		return "adminPage1";
		}
		return "loginfail";
	}
}
