package com.Food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Food.entities.Delivery;
import com.Food.service.DeliverService;


@RestController
public class DeliveryController {
	@Autowired
	DeliverService dd;                                               
	
	@PostMapping("/AddDelivery")                                       
	ResponseEntity<Delivery> AddDelivery(@RequestBody Delivery delivery)
	{	
		return new ResponseEntity<Delivery>(dd.AddDelivery( delivery),HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/getAllDeliveryDetails")                                    
	List<Delivery> getAllDeliveryDetails()
	{		
		return dd.getAllDeliveryDetails();
	}
	
}
