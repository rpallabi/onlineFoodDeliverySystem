package com.Food.service;

import java.util.List;

import com.Food.entities.Delivery;


public interface DeliverService {
	Delivery AddDelivery(Delivery delivery);

	List<Delivery> getAllDeliveryDetails();
	
	Delivery getDeliveryById(int deliveryid);
	
	Delivery updateDelivery(int deliveryid, Delivery delivery);

	String deleteDeliveryById(int deliveryid);

	String deleteDelivery();
}
