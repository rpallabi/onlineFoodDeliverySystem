package com.Food.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Food.entities.Review;
import com.Food.repository.ReviewRepository;
import com.Food.service.ReviewService;


@Service
public class ReviewServiceImp implements ReviewService{
		@Autowired
		ReviewRepository rv;
		
		@Override
		public Review AddReview(Review review) {
			
			return rv.save(review);
		}
		
		@Override
		public List<Review>getAllReviews() {            
			List<Review> le=rv.findAll();
			return le;
		}
}
