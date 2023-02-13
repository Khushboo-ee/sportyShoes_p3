package com.sportyshoes.p3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.p3.dao.CustomerRepository;
import com.sportyshoes.p3.entity.Customer;

@Service
public class CustomerService  {

	@Autowired(required = false)
	private CustomerRepository customerRepository;

	public Customer addCustomer(Customer cust) {
		Customer result = this.customerRepository.save(cust);
		return result;
	}

}
