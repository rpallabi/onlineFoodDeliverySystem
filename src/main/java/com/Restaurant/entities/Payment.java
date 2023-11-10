package com.Restaurant.entities;

<<<<<<< HEAD


import java.util.Date;
=======
>>>>>>> 60499dd77ba5844fee6689b4f15e9717ac03f07b


<<<<<<< HEAD
=======
import java.util.Date;

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
@Table(name = "Payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "P_id")
	int pid;

	@Column(name = "Amount", nullable = false)
	int amount;
	
	@Column(name = "Payment_date")
	Date paymentDate;
	
	@Column(name = "Pay_method", nullable = false, length = 50)
	String paymentMethod;
	
<<<<<<< HEAD
	@JsonIgnore
=======
>>>>>>> 60499dd77ba5844fee6689b4f15e9717ac03f07b
	@OneToOne(cascade=CascadeType.ALL)
	  @JoinColumn(name="O_id")
	  public Orders orders;
	
<<<<<<< HEAD
	@JsonIgnore
=======
>>>>>>> 60499dd77ba5844fee6689b4f15e9717ac03f07b
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "U_id", referencedColumnName = "U_id")
	public User user;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
