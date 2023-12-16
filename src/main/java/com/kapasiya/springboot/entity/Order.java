package com.kapasiya.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order")
public class Order 
{
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long orderId;
	
	@Column(name ="ordername", nullable = false)
	private String ordername;
	
	@Column(name ="currencyUomId", nullable = false)
    private String currencyUomId; 
	
	@Column(name ="salesChannelEnumId", nullable = false)
    private String salesChannelEnumId;
	
	@Column(name ="statusId", nullable = false)
    private String statusId;
	
	@Column(name ="productStoreId", nullable = false)
    private String productStoreId;
	
	@Column(name ="placedDate", nullable = false)
    private String placedDate;

	

	public Order(Long orderId, String ordername, String currencyUomId, String salesChannelEnumId, String statusId,
			String productStoreId, String placedDate) {
		super();
		this.orderId = orderId;
		this.ordername = ordername;
		this.currencyUomId = currencyUomId;
		this.salesChannelEnumId = salesChannelEnumId;
		this.statusId = statusId;
		this.productStoreId = productStoreId;
		this.placedDate = placedDate;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public String getCurrencyUomId() {
		return currencyUomId;
	}

	public void setCurrencyUomId(String currencyUomId) {
		this.currencyUomId = currencyUomId;
	}

	public String getSalesChannelEnumId() {
		return salesChannelEnumId;
	}

	public void setSalesChannelEnumId(String salesChannelEnumId) {
		this.salesChannelEnumId = salesChannelEnumId;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public String getProductStoreId() {
		return productStoreId;
	}

	public void setProductStoreId(String productStoreId) {
		this.productStoreId = productStoreId;
	}

	public String getPlacedDate() {
		return placedDate;
	}

	public void setPlacedDate(String placedDate) {
		this.placedDate = placedDate;
	}

	public Order() {
		super();
	}
	

}
