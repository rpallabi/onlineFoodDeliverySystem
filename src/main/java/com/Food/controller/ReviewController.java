package com.Food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Food.entities.Review;
import com.Food.service.ReviewService;


@RestController
public class ReviewController {
	@Autowired
	ReviewService rs;                                               
	
	@PostMapping("/AddReview")                                       
	ResponseEntity<Review> AddReview(@RequestBody Review review)
	{	
		return new ResponseEntity<Review>(rs.AddReview( review),HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/getAllReviews")                                    
	List<Review> getAllReviews()
	{		
		return rs.getAllReviews();
	}
	
	
}
