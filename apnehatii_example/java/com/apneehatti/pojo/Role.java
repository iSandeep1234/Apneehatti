package com.apneehatti.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "ROLE", schema = "LF")
public class Role {

	@Column(name="roleName")
	private String roleName;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
