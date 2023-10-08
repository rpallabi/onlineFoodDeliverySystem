package com.Food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Food.entities.Orders;
import com.Food.service.OrdersService;

@RestController
public class OrdersController {
	@Autowired
	OrdersService od;                                               
	
	@PostMapping("/AddOrders")                                       
	ResponseEntity<Orders> createBooking(@RequestBody Orders orders)
	{	
		return new ResponseEntity<Orders>(od.AddOrders( orders),HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/getAllOrders")                                    
	List<Orders> getAllOrders()
	{		
		return od.getAllOrders();
	}
	
}
