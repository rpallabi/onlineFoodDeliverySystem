package com.Food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Food.entities.Delivery;


public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {

}
