package com.Food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Food.entities.Payment;

import com.Food.service.PaymentService;

@RestController
public class PaymentController {
	@Autowired
	PaymentService rs;                                               
	
	@PostMapping("/CreatePayment")                                       
	ResponseEntity<Payment> CreatePayment(@RequestBody Payment payment)
	{	
		return new ResponseEntity<Payment>(rs.CreatePayment( payment),HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/getAllPayments")                                    
	List<Payment> getAllPayments()
	{		
		return rs.getAllPayments();
	}
}
