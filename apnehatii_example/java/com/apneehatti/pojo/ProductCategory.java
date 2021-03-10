package com.apneehatti.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "PRODUCT_CATEGORY", schema = "LF")
public class ProductCategory {

	@Column(name="productName")
	 private String productName;
	
	@Column(name="description")
	    private String description;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
