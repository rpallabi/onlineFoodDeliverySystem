package com.Food.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Food.entities.Delivery;

import com.Food.repository.DeliveryRepository;

import com.Food.service.DeliverService;


@Service
public class DeliveryServiceImp implements DeliverService{
	
	@Autowired
	DeliveryRepository td;
	
	@Override
	public Delivery AddDelivery(Delivery delivery) {
		
		return td.save(delivery);
	}
	
	@Override
	public List<Delivery>getAllDeliveryDetails() {               
		List<Delivery> le=td.findAll();
		return le;
	}
}
