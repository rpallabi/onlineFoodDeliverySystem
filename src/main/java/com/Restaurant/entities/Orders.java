package com.Restaurant.entities;
<<<<<<< HEAD

import com.fasterxml.jackson.annotation.JsonIgnore;
=======
>>>>>>> 60499dd77ba5844fee6689b4f15e9717ac03f07b

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "O_id")
	int orderId;

	@Column(name = "Total_Price")
	int totalPrice;
	@Column(name = "Total_Quantity")
	int totalQuantity;
	
<<<<<<< HEAD
	@JsonIgnore
=======
>>>>>>> 60499dd77ba5844fee6689b4f15e9717ac03f07b
	@OneToOne(cascade=CascadeType.ALL)
	  @JoinColumn(name="OI_id")
	  public OrderItems orderitems;
	
<<<<<<< HEAD
	@JsonIgnore
=======
>>>>>>> 60499dd77ba5844fee6689b4f15e9717ac03f07b
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "U_id", referencedColumnName = "U_id")
	public User user;
	
<<<<<<< HEAD
	@JsonIgnore
	@OneToOne(mappedBy = "orders", cascade = CascadeType.ALL)
 	public Payment payment;
	
	@JsonIgnore
	@OneToOne(mappedBy = "orders", cascade = CascadeType.ALL)
=======
	@OneToOne(mappedBy = "orders", cascade = CascadeType.ALL)
 	public Payment payment;
	
	@OneToOne(mappedBy = "orders", cascade = CascadeType.ALL)
>>>>>>> 60499dd77ba5844fee6689b4f15e9717ac03f07b
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

	public OrderItems getOrderitems() {
		return orderitems;
	}

	public void setOrderitems(OrderItems orderitems) {
		this.orderitems = orderitems;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}
    
}
