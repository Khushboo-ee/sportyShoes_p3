package com.sportyshoes.p3.dao;

import org.springframework.data.repository.CrudRepository;

import com.sportyshoes.p3.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
