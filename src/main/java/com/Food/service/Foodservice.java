package com.Food.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Food.entities.Food;
import com.Food.repository.FoodRepository;

@Service
public class Foodservice {

	@Autowired
	private FoodRepository foodRepository;
	
	public Food saveFoodData(Food food){
	Food savedFood =	foodRepository.save(food);
		return savedFood;
	}

}
