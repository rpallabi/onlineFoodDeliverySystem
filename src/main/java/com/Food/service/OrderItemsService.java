package com.Food.service;

import java.util.List;

import com.Food.entities.OrderItems;

public interface OrderItemsService {
	OrderItems AddOrderItems(OrderItems orderitems);

	List<OrderItems> getAllOrderItems();
	
	OrderItems getOrderItemsById(int orderItemId);
	
	OrderItems updateOrderItems(int orderItemId, OrderItems orderitems);

	String deleteOrderItemsById(int orderItemId);

	String deleteOrderItems();
}
