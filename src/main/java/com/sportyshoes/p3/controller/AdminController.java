package com.sportyshoes.p3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.p3.entity.Admin;
import com.sportyshoes.p3.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
//adding admin data
@PostMapping("/add-admin")
public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin) {// @RequestBody will convert json data entered by client to object  
	Admin a = null;
	try {
		a = this.adminService.addAdmin(admin);
		System.out.println(admin);
		return ResponseEntity.status(HttpStatus.CREATED).body(a);
	} catch (Exception e) {
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()	;
	}
	
}
}