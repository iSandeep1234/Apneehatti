package com.apneehatti.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

import com.apneehatti.constant.Status;

@Table(name = "PAYMENT", schema = "LF")
public class Payment {
	
	@Column(name="totalAmount")
	 private double totalAmount;
	
	@Column(name="serviceCharge")
	    private double serviceCharge;
	
	@Column(name="gstAmount")
	    private double gstAmount;
	
	@Column(name="discountAmount")
	    private double discountAmount;
	
	@Column(name="discountAppliedFor")
	    private String discountAppliedFor;
	
	@Column(name="status")
	    private Status status;

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public double getGstAmount() {
		return gstAmount;
	}

	public void setGstAmount(double gstAmount) {
		this.gstAmount = gstAmount;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountAppliedFor() {
		return discountAppliedFor;
	}

	public void setDiscountAppliedFor(String discountAppliedFor) {
		this.discountAppliedFor = discountAppliedFor;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	

}
