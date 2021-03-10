package com.apneehatti.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "CLIENT_CATEGORY", schema = "LF")
public class ClientCategory {
	
	@Column(name="totalAmount")
	private String categoryName;

	@Column(name="totalAmount")
    private String description;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
