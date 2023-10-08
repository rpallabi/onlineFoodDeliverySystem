package com.Food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Food.entities.OrderItems;
import com.Food.service.OrderItemsService;

@RestController
public class OrderItemsController {
	@Autowired
	OrderItemsService oi;                                               
	
	@PostMapping("/AddOrderItems")                                       
	ResponseEntity<OrderItems> AddOrderItems(@RequestBody OrderItems orderitems)
	{	
		return new ResponseEntity<OrderItems>(oi.AddOrderItems( orderitems),HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/getAllOrderItems")                                    
	List<OrderItems> getAllOrderItems()
	{		
		return oi.getAllOrderItems();
	}
	

}
