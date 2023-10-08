package com.Food.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Food.entities.TableBooking;
import com.Food.repository.TableBookingRepository;
import com.Food.service.TableBookingService;

@Service
public class TableBookingServiceImp implements TableBookingService{
	
	@Autowired
	TableBookingRepository tb;
	
	@Override
	public TableBooking createBooking(TableBooking tablebooking) {
		
		return tb.save(tablebooking);
	}
	
	@Override
	public List<TableBooking>getAllBooking() {               
		List<TableBooking> le=tb.findAll();
		return le;
	}
	@Override
	public TableBooking getBookingById(int bookingId) {             
		TableBooking s=tb.findById(bookingId).get();
		return s;
	}
	

}
