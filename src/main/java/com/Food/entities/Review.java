package com.Food.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Review {
	@Id
	@Column(name = "No_Of_Rating")
	int ratingNo;
	@Column(name = "Total_Rating")
	int totalrating;
	
	@ManyToOne
    @JoinColumn(name="F_id")
	
    public Food foods;
	
	public int getRatingNo() {
		return ratingNo;
	}
	public void setRatingNo(int ratingNo) {
		this.ratingNo = ratingNo;
	}
	public int getTotalrating() {
		return totalrating;
	}
	public void setTotalrating(int totalrating) {
		this.totalrating = totalrating;
	}
	public Food getFoods() {
		return foods;
	}
	public void setFoods(Food foods) {
		this.foods = foods;
	}
	
	
}
