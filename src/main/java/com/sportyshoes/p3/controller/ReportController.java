package com.sportyshoes.p3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.sportyshoes.p3.entity.Reports;
import com.sportyshoes.p3.service.ReportService;

@Controller
public class ReportController {
	
	@Autowired
	private ReportService reportService;
	
	@GetMapping("/reportList")
	public String getAll(Model model){

			List<Reports> list = reportService.getAll();
		model.addAttribute("reports",list);
		return "reports";
	}
	
}
