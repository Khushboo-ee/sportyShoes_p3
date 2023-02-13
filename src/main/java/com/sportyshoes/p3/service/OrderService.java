package com.sportyshoes.p3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.p3.dao.OrderRepository;
import com.sportyshoes.p3.entity.Order;

@Service
public class OrderService {

	@Autowired(required = false)
	private OrderRepository orderRepository;

	public Order addOrder(Order order) {
		Order result = this.orderRepository.save(order);
		return result;
	}
}
