package com.apneehatti.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

import com.apneehatti.model.ClientCategory;

@Table(name = "CLIENT", schema = "LF")
public class Client {
	
	@Column(name="name")
	 private String name;
	
	@Column(name="street1")
	    private String street1;
	
	@Column(name="street2")
	    private String street2;
	
	@Column(name="street3")
	    private String street3;
	
	@Column(name="city")
	    private String city;
	
	@Column(name="state")
	    private String state;
	
	@Column(name="pinCode")
	    private long pinCode;
	
	@Column(name="clientCategory")
	    private ClientCategory clientCategory;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getStreet3() {
		return street3;
	}

	public void setStreet3(String street3) {
		this.street3 = street3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public ClientCategory getClientCategory() {
		return clientCategory;
	}

	public void setClientCategory(ClientCategory clientCategory) {
		this.clientCategory = clientCategory;
	}
	
	

}
