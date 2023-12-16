package com.kapasiya.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Product 
{
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private String productId;
	
	@Column(name ="productName", nullable = false)
	private String productName;
	
	
	@Column(name ="owner_party_id", nullable = false)
	private String owner_party_id;
	
	
	@Column(name ="description", nullable = false)
	private String description;
	
	
	@Column(name ="returnable", nullable = false)
	private String returnable;
	
	
	@Column(name ="charge_shipping", nullable = false)
	private String charge_shipping;


	public Product(String productId, String productName, String owner_party_id, String description, String returnable,
			String charge_shipping) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.owner_party_id = owner_party_id;
		this.description = description;
		this.returnable = returnable;
		this.charge_shipping = charge_shipping;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getOwner_party_id() {
		return owner_party_id;
	}


	public void setOwner_party_id(String owner_party_id) {
		this.owner_party_id = owner_party_id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getReturnable() {
		return returnable;
	}


	public void setReturnable(String returnable) {
		this.returnable = returnable;
	}


	public String getCharge_shipping() {
		return charge_shipping;
	}


	public void setCharge_shipping(String charge_shipping) {
		this.charge_shipping = charge_shipping;
	}


	public Product() {
		super();
	}
	
	

}
