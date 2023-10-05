package com.Food.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "OrderItems")
public class OrderItems {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OI_id")
     int orderItemId;

    @Column(name = "F_name")
     String foodName;

    @Column(name = "Quantity")
     int quantity;

    @Column(name = "Price")
     int price;
    
    
    //@OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "F_id")
    //public Food food;
    
    //@ManyToOne
    //@JoinColumn(name = "order_id")
    //public Order order;
    
    //@ManyToOne(optional= "orderItems", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //public Order order;
    
    @ManyToMany
    @JoinTable(
        name = "order_item_food",
        joinColumns = @JoinColumn(name = "OI_id"),
        inverseJoinColumns = @JoinColumn(name = "F_id")
    )
    public Set<Food> food = new HashSet<>();
    
    @OneToOne(mappedBy = "orderItems", cascade = CascadeType.ALL)
    public Orders orders;

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
