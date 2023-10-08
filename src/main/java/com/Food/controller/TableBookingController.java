package com.Food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Food.entities.TableBooking;
import com.Food.service.TableBookingService;

@RestController
public class TableBookingController {
	@Autowired
		TableBookingService bk;                                               
		
		@PostMapping("/createBooking")                                       
		ResponseEntity<TableBooking> createBooking(@RequestBody TableBooking tablebooking)
		{	
			return new ResponseEntity<TableBooking>(bk.createBooking( tablebooking),HttpStatus.CREATED);
		}
		
		
		
		@GetMapping("/getAllBooking")                                    
		List<TableBooking> getAllBooking()
		{		
			return bk.getAllBooking();
		}
		
		@GetMapping("/getBookingById/{id}")                             
		TableBooking getBookingById(@PathVariable int bookingId)
		{		
			return bk.getBookingById(bookingId);
		}
}
