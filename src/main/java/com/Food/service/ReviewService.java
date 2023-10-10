package com.Food.service;

import java.util.List;

import com.Food.entities.Review;



public interface ReviewService {
	Review AddReview(Review review);

	List<Review> getAllReviews();
	
	Review getReviewById(int ratingNo);
	
	Review updateReview(int ratingNo, Review review);

	String deleteReviewById(int ratingNo);

	String deleteReview();
}
