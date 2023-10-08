package com.Food.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Food.entities.OrderItems;

import com.Food.repository.OrderItemRepository;

import com.Food.service.OrderItemsService;
@Service
public class OrderItemsServiceImp implements OrderItemsService{
	@Autowired
	OrderItemRepository tb;
	
	@Override
	public OrderItems AddOrderItems(OrderItems orderitems) {
		
		return tb.save(orderitems);
	}
	
	@Override
	public List<OrderItems>getAllOrderItems() {               
		List<OrderItems> le=tb.findAll();
		return le;
	}
}
