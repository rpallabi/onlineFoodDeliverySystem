package com.Food.service;

import java.util.List;

import com.Food.entities.Payment;


public interface PaymentService {
	Payment CreatePayment(Payment payment);

	List<Payment> getAllPayments();
	
	Payment getPaymentById(int pid);
	
	Payment updatePayment(int pid, Payment payment);

	String deletePaymentById(int pid);

	String deletePayment();

}
