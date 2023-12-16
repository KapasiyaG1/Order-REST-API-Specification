package com.kapasiya.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderheader")
public class OrderHeader 
{
	@Id
	private Long orderId;
	
	
	@Column(name ="orderName", nullable = false)
	private String orderName;
	
	
	@Column(name ="placedDate", nullable = false)
	private String placedDate;
	
	
	@Column(name ="approvedDate", nullable = false)
	private String approvedDate;
	
	
	@Column(name ="statusId", nullable = false)
	private String statusId;
	
	
	@Column(name ="currencyUomId", nullable = false)
	private String currencyUomId;

	
	@Column(name ="productStoreId", nullable = false)
	private String productStoreId;
	
	@Column(name ="salesChannelEnumId", nullable = false)
	private String salesChannelEnumId;

	
	@Column(name ="orderItem", nullable = false)
	private String orderItem;

	
	@Column(name ="orderPart", nullable = false)
	private String orderPart;

	
	@Column(name ="grandTotal", nullable = false)
	private String grandTotal;
	
	@ManyToOne
	@JoinColumn(name="orderId", nullable=false)
	private SalesChannelEnumId saleschannelenumid;
	
	


	public Long getOrderId() {
		return orderId;
	}


	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}


	public String getOrderName() {
		return orderName;
	}


	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}


	public String getPlacedDate() {
		return placedDate;
	}


	public void setPlacedDate(String placedDate) {
		this.placedDate = placedDate;
	}


	public String getApprovedDate() {
		return approvedDate;
	}


	public void setApprovedDate(String approvedDate) {
		this.approvedDate = approvedDate;
	}


	public String getStatusId() {
		return statusId;
	}


	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}


	public String getCurrencyUomId() {
		return currencyUomId;
	}


	public void setCurrencyUomId(String currencyUomId) {
		this.currencyUomId = currencyUomId;
	}


	public String getProductStoreId() {
		return productStoreId;
	}


	public void setProductStoreId(String productStoreId) {
		this.productStoreId = productStoreId;
	}


	public String getSalesChannelEnumId() {
		return salesChannelEnumId;
	}


	public void setSalesChannelEnumId(String salesChannelEnumId) {
		this.salesChannelEnumId = salesChannelEnumId;
	}


	public String getOrderItem() {
		return orderItem;
	}


	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}


	public String getOrderPart() {
		return orderPart;
	}


	public void setOrderPart(String orderPart) {
		this.orderPart = orderPart;
	}


	public String getGrandTotal() {
		return grandTotal;
	}


	public void setGrandTotal(String grandTotal) {
		this.grandTotal = grandTotal;
	}


	public OrderHeader(Long orderId, String orderName, String placedDate, String approvedDate, String statusId,
			String currencyUomId, String productStoreId, String salesChannelEnumId, String orderItem, String orderPart,
			String grandTotal, SalesChannelEnumId saleschannelenumid2) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.placedDate = placedDate;
		this.approvedDate = approvedDate;
		this.statusId = statusId;
		this.currencyUomId = currencyUomId;
		this.productStoreId = productStoreId;
		this.salesChannelEnumId = salesChannelEnumId;
		this.orderItem = orderItem;
		this.orderPart = orderPart;
		this.grandTotal = grandTotal;
		
	}


	public OrderHeader() {
		super();
	}
	
	
	

}
