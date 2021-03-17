package com.apneehatti.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

import com.apneehatti.constant.Status;
import com.apneehatti.model.Payment;
import com.apneehatti.model.Product;
import com.apneehatti.model.User;

@Table(name = "ORDER", schema = "LF")
public class Order {

	@Column(name="user")
	 private User user;
	
	@Column(name="product")
	 private Product product;
	
	@Column(name="quantity")
	    private int quantity;
	
	@Column(name="price")
	    private double price;
	
	@Column(name="totalAmount")
	    private double totalAmount;
	
	@Column(name="payment")
	    private Payment payment;
	
	@Column(name="status")
	    private Status status;
	
	@Column(name="paidBy")
	    private String paidBy;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getPaidBy() {
		return paidBy;
	}

	public void setPaidBy(String paidBy) {
		this.paidBy = paidBy;
	}
	
	
}
