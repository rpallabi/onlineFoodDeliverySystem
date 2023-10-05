package com.Food.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Food.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}