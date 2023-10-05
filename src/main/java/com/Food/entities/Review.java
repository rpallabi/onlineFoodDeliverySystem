package com.Food.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Review {
	@Id
	int no_of_rating;
	int total_rating;
	@ManyToOne
    @JoinColumn(name="F_id")
    public Food food;
	public int getNo_of_rating() {
		return no_of_rating;
	}
	public void setNo_of_rating(int no_of_rating) {
		this.no_of_rating = no_of_rating;
	}
	public int getTotal_rating() {
		return total_rating;
	}
	public void setTotal_rating(int total_rating) {
		this.total_rating = total_rating;
	}
	
}
