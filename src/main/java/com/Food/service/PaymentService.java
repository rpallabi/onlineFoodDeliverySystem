package com.Food.service;

import java.util.List;

import com.Food.entities.Payment;



public interface PaymentService {
	Payment CreatePayment(Payment payment);               
	List<Payment> getAllPayments(); 

}
