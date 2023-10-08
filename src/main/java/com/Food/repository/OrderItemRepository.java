package com.Food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Food.entities.OrderItems;

public interface OrderItemRepository extends JpaRepository<OrderItems, Integer> {

}
