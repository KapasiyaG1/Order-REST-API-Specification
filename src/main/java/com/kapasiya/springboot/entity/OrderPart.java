package com.kapasiya.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderparty")
public class OrderPart 
{
	@Id
	@Column(insertable=false, updatable=false)
	private String orderId;
	
	@Column(name ="orderPartSeqId", nullable = false)
	private String orderPartSeqId;

	
	@Column(name ="partName", nullable = false)
	private String partName;
	
	
	@Column(name ="statusId", nullable = false)
	private String statusId;
	
	@Column(name ="vendorPartyId", nullable = false)
	private String vendorPartyId;

	@Column(name ="customerPartyId", nullable = false)
	private String customerPartyId;

	@Column(name ="partTotal", nullable = false)
	private String partTotal;
	
	@Column(name ="facilityId", nullable = false)
	private String facilityId;
	
	@Column(name ="shipmentMethodEnumId", nullable = false)
	private String shipmentMethodEnumId;
	
	
	@ManyToOne
	@JoinColumn(name="orderparty", nullable=false)
	private Party party;


	public OrderPart(String orderId, String orderPartSeqId, String partName, String statusId, String vendorPartyId,
			String customerPartyId, String partTotal, String facilityId, String shipmentMethodEnumId, Party party) {
		super();
		this.orderId = orderId;
		this.orderPartSeqId = orderPartSeqId;
		this.partName = partName;
		this.statusId = statusId;
		this.vendorPartyId = vendorPartyId;
		this.customerPartyId = customerPartyId;
		this.partTotal = partTotal;
		this.facilityId = facilityId;
		this.shipmentMethodEnumId = shipmentMethodEnumId;
	
	}


	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public String getOrderPartSeqId() {
		return orderPartSeqId;
	}


	public void setOrderPartSeqId(String orderPartSeqId) {
		this.orderPartSeqId = orderPartSeqId;
	}


	public String getPartName() {
		return partName;
	}


	public void setPartName(String partName) {
		this.partName = partName;
	}


	public String getStatusId() {
		return statusId;
	}


	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}


	public String getVendorPartyId() {
		return vendorPartyId;
	}


	public void setVendorPartyId(String vendorPartyId) {
		this.vendorPartyId = vendorPartyId;
	}


	public String getCustomerPartyId() {
		return customerPartyId;
	}


	public void setCustomerPartyId(String customerPartyId) {
		this.customerPartyId = customerPartyId;
	}


	public String getPartTotal() {
		return partTotal;
	}


	public void setPartTotal(String partTotal) {
		this.partTotal = partTotal;
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



	public OrderPart() {
		super();
	}
	
	

}
