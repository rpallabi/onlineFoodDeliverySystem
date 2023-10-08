package com.Food.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Food.entities.Orders;

import com.Food.repository.OrdersRepository;

import com.Food.service.OrdersService;

@Service
public class OrdersServiceImp implements OrdersService{
	
	@Autowired
	OrdersRepository ord;
	
	@Override
	public Orders AddOrders(Orders orders) {
		
		return ord.save(orders);
	}
	
	@Override
	public List<Orders>getAllOrders() {               
		List<Orders> le=ord.findAll();
		return le;
	}
	
	
}
