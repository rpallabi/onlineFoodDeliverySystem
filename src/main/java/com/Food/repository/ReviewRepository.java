package com.Food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Food.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

}
