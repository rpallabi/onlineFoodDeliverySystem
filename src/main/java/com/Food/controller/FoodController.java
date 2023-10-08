package com.Food.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Food.entities.Food;
import com.Food.service.Foodservice;


@RestController
public class FoodController {
	@Autowired
	private Foodservice foodService;
	public static String uploadDirectory = System.getProperty("user.dir")+"/src/main/webapp/images";
	@GetMapping("/")
	public String home(){
		return "Welcome to Image uploading app";
	}
	
	@PostMapping("/saveData")
	public Food saveFood(@ModelAttribute Food food,
			@RequestParam("image") MultipartFile file) throws IOException {
		String originalFilename= file.getOriginalFilename();
		java.nio.file.Path fileNameAndPath = Paths.get(uploadDirectory, originalFilename);
		Files.write(fileNameAndPath, file.getBytes());
		food.setProfileImage(originalFilename);
		
		Food savedFoodData= foodService.saveFoodData(food);
		return savedFoodData;
	}
}
