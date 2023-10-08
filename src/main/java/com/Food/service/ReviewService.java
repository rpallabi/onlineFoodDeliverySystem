package com.Food.service;

import java.util.List;

import com.Food.entities.Review;


public interface ReviewService {
	Review AddReview(Review review);               
	List<Review> getAllReviews(); 

}
