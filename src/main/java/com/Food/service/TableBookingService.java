package com.Food.service;

import java.util.List;

import com.Food.entities.TableBooking;



public interface TableBookingService {
	TableBooking createBooking(TableBooking tablebooking);               
	List<TableBooking> getAllBooking();                          
	TableBooking getBookingById(int bookingId);
	

}
