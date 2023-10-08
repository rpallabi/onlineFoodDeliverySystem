package com.Food.entities;

import java.sql.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Delivery")
public class Delivery {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "D_id")
     int deliveryid;
	
	@Column(name = "Deliver_Date", nullable = false)
	Date deliverydate;
   
   
   
   @Column(name = "Pay_mode", nullable = false, length = 50)
    String paymentMode;
   
   @Column(name = "Amount_To_Be_Collected", nullable = false)
    int amountToBeCollected;
   
   @Column(name = "No_of_items", nullable = false)
    int numberOfItems;
    
   @OneToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "O_id")
   public Orders orders;
   
   @OneToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "U_id")
   public User user;
	
	public int getDeliveryid() {
		return deliveryid;
	}

	public void setDeliveryid(int deliveryid) {
		this.deliveryid = deliveryid;
	}

	
	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public int getAmountToBeCollected() {
		return amountToBeCollected;
	}

	public void setAmountToBeCollected(int amountToBeCollected) {
		this.amountToBeCollected = amountToBeCollected;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	

	public Date getDeliverydate() {
		return deliverydate;
	}

	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	
    


	
    

}
