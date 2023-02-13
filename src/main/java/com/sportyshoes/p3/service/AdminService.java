package com.sportyshoes.p3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.p3.dao.AdminRepository;
import com.sportyshoes.p3.entity.Admin;

@Service
public class AdminService {
	
	@Autowired (required = false)
	private AdminRepository adminRepo;
	
	public Admin addAdmin(Admin a) {
		Admin result = this.adminRepo.save(a);
		return result;
	}

}
