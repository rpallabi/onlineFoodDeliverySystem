
package com.Food.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class Orders {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "O_id")
     int orderId;

    @Column(name = "Total_Price")
     int totalPrice;

    @Column(name = "Total_Quantity")
     int totalQuantity;
    
    @ManyToOne
    @JoinColumn(name="U_id")
    public User user;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OI_id")
    public OrderItems orderItems;
    
    @OneToOne(mappedBy = "orders", cascade = CascadeType.ALL)
    public Payment payment;
    
    @OneToOne(mappedBy = "orders", cascade = CascadeType.ALL)
    public Delivery delivery;
    
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

}

