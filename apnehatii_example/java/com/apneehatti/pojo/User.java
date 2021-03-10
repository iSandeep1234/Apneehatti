package com.apneehatti.pojo;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.apneehatti.constant.Status;
import apnehatii_example.model.Role;

@Table(name = "USER", schema = "LF")
public class User {

	@Column(name="name")
	private String name;
	
	@Column(name="email")
    private String email;
	
	@Column(name="mobile")
    private String mobile;
	
	@Column(name="userName")
    private String userName;
	
	@Column(name="password")
    private String password;
	
	@Column(name="role")
    private Role role;
	
	@Column(name="pinCode")
    private long pinCode;
	
	@Column(name="status")
    private Status status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
}