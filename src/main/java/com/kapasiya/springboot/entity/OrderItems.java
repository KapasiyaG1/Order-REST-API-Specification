package com.kapasiya.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderitems")
public class OrderItems
{
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private String productId;
	
	@Column(name ="orderId", nullable = false)
	private String orderId;
	
	@Column(name ="partName", nullable = false)
	private String partName;
	
	@Column(name ="facilityId", nullable = false)
	private String facilityId;
	
	@Column(name ="shipmentMethodEnumId", nullable = false)
	private String shipmentMethodEnumId;
	
	@Column(name ="customerPartyId", nullable = false)
	private String customerPartyId;
	
	@Column(name ="itemdetails", nullable = false)
	private String item_details;
	


	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}

	public String getShipmentMethodEnumId() {
		return shipmentMethodEnumId;
	}

	public void setShipmentMethodEnumId(String shipmentMethodEnumId) {
		this.shipmentMethodEnumId = shipmentMethodEnumId;
	}

	public String getCustomerPartyId() {
		return customerPartyId;
	}

	public void setCustomerPartyId(String customerPartyId) {
		this.customerPartyId = customerPartyId;
	}

	public String getItem_details() {
		return item_details;
	}

	public void setItem_details(String item_details) {
		this.item_details = item_details;
	}



	public OrderItems(String productId, String orderId, String partName, String facilityId,
			String shipmentMethodEnumId, String customerPartyId, String item_details, String itemDescription,
			String quantity, String unitAmount) {
		super();
		this.productId = productId;
		this.orderId = orderId;
		this.partName = partName;
		this.facilityId = facilityId;
		this.shipmentMethodEnumId = shipmentMethodEnumId;
		this.customerPartyId = customerPartyId;
		this.item_details = item_details;
		
	}

	public OrderItems() {
		super();
	}

    
    


}
