package com.apneehatti.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

import com.apneehatti.constant.Size;
import com.apneehatti.constant.Status;
import apnehatii_example.model.ProductCategory;

@Table(name = "PRODUCT", schema = "LF")
public class Product {

	@Column(name="productName")
	 private String productName;
	
	@Column(name="productCategory")
	 private ProductCategory productCategory;
	
	@Column(name="price")
	    private double price;
	
	@Column(name="quantity")
	    private int quantity;
	
	@Column(name="size")
	    private Size size;
	
	@Column(name="image")
	    private String image; //Need to change the type based on our confirmation
	    
	@Column(name="status")
	private Status status;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
}
