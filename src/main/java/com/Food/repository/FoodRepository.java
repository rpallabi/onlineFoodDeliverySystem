package com.Food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Food.entities.Food;

public interface FoodRepository extends JpaRepository<Food, Integer> {

}
