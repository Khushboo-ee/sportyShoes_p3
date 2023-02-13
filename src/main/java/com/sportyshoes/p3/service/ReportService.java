package com.sportyshoes.p3.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.p3.dao.ReportsRepository;
import com.sportyshoes.p3.entity.Reports;


@Service
public class ReportService {
	@Autowired (required = false)
	private ReportsRepository reportsRepository;

	public List<Reports> getAll(){
		List<Reports> list = (List<Reports>)this.reportsRepository.findAll();
		return list;
	}
	
}
