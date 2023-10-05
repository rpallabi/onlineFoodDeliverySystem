package com.Food.entities;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "U_id")
     int id;

    @Column(name = "U_name", nullable = false, length = 50)
     String userName;

    @Column(name = "Password", nullable = false, length = 255)
     String password;

    @Column(name = "Email", unique = true, nullable = false, length = 100)
     String email;

    @Column(name = "Phone_number", length = 15)
     String phoneNumber;

    @Column(name = "Address")
     String address;

    @Column(name = "U_type", nullable = false, length = 50)
     String userType;
    
    @OneToMany(mappedBy="user")
	List<Food> OrderFood;
    
    @OneToMany(mappedBy="user")
   	List<TableBooking> tableBooking;
    
    @OneToMany(mappedBy="user")
   	List<Orders> orders;
    
    @OneToMany(mappedBy="user")
   	List<Payment> payment;
    
    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", userType=" + userType + "]";
	}

}
