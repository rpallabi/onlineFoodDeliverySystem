package com.Food.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToMany;

//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;

import jakarta.persistence.Table;

@Entity
@Table(name = "Food")
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "F_id")
	private int fid;
	@Column(name = "F_name", nullable = false, length = 50)
	private String foodname;

	@Column(name = "F_type", nullable = false, length = 50)
	private String type;

	@Column(name = "F_description", columnDefinition = "TEXT")
	private String description;

	@Column(name = "F_price", nullable = false)
	private int price;

	@Column(name = "F_Quantity", nullable = false)
	private Integer quantity;

	@Column(name = "Image")
	private String profileImage;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "Admin_id")
	public User admin;
	
	@JsonIgnore
	@OneToMany(mappedBy = "foods")
	List<Review> reviews;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "food")
	public Set<OrderItems> orderItems = new HashSet<>();

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public User getAdmin() {
		return admin;
	}

	public void setAdmin(User admin) {
		this.admin = admin;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Set<OrderItems> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Set<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}

}
