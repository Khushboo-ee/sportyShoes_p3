package com.sportyshoes.p3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.p3.entity.Order;
import com.sportyshoes.p3.service.OrderService;


@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/add-order")
	public ResponseEntity<Order> addOrder(@RequestBody Order order) {
		Order o = null;
		try {
			o = this.orderService.addOrder(order);
			System.out.println(order);
			return ResponseEntity.status(HttpStatus.CREATED).body(o);
		} 
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
}
