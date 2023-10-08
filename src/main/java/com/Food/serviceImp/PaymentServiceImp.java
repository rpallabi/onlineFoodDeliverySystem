package com.Food.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Food.entities.Payment;
import com.Food.repository.PaymentRepository;
import com.Food.service.PaymentService;



@Service
public class PaymentServiceImp implements PaymentService{
		@Autowired
		PaymentRepository pmt;
		
		@Override
		public Payment CreatePayment(Payment payment) {
			
			return pmt.save(payment);
		}
		
		@Override
		public List<Payment>getAllPayments() {              
			List<Payment> le=pmt.findAll();
			return le;
		}
}
