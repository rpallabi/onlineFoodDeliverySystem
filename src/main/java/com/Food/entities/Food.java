package com.Food.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.Table;

@Entity
@Table(name = "Food")
public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "F_id")
     int id;

    @Column(name = "F_name", nullable = false, length = 50)
     String name;

    @Column(name = "F_type", nullable = false, length = 50)
     String type;

    @Column(name = "F_description", columnDefinition = "TEXT")
     String description;

    @Column(name = "F_price", nullable = false)
     int price;

    @Column(name = "F_Quantity", nullable = false)
     Integer quantity;

    @Column(name = "Image", length = 255)
     String image;
    
    @ManyToOne
    @JoinColumn(name="Admin_id")
    public User user;
   
    @OneToMany(mappedBy="food")
	List<Review> reviews;
   
    //@OneToOne(mappedBy="food")
   	//List<OrderItems> orderItems;
    
    @ManyToMany(mappedBy = "food")
    public Set<OrderItems> orderItems = new HashSet<>();
    
    
    //@OneToOne(mappedBy = "food", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //public OrderItems orderItems;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
