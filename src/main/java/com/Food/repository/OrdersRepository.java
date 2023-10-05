package com.Food.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Food.entities.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
