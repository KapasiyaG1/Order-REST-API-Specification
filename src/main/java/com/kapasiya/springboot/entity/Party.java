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
@Table(name = "party")
public class Party 
{
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long partyId;
	
	
	@Column(name ="partyTypeEnumId", nullable = false)
	private String partyTypeEnumId;
	
	
	@Column(name ="orderpart", nullable = false)
	private String order_part;
	
	
	


	public Party(Long partyId, String partyTypeEnumId, String order_part, PartyTypeEnumId partytypeenumId2,
			OrderPart orderpart) {
		super();
		this.partyId = partyId;
		this.partyTypeEnumId = partyTypeEnumId;
		this.order_part = order_part;
		
	}


	public Long getPartyId() {
		return partyId;
	}


	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}


	public String getPartyTypeEnumId() {
		return partyTypeEnumId;
	}


	public void setPartyTypeEnumId(String partyTypeEnumId) {
		this.partyTypeEnumId = partyTypeEnumId;
	}


	public String getOrder_part() {
		return order_part;
	}


	public void setOrder_part(String order_part) {
		this.order_part = order_part;
	}


//	public PartyTypeEnumId getPartytypeenumId() {
//		return partytypeenumId;
//	}
//
//
//	public void setPartytypeenumId(PartyTypeEnumId partytypeenumId) {
//		this.partytypeenumId = partytypeenumId;
//	}
//
//
//	public Order_Part getOrderpart() {
//		return orderpart;
//	}
//
//
//	public void setOrderpart(Order_Part orderpart) {
//		this.orderpart = orderpart;
//	}


	public Party() {
		super();
	}
	
	
	
}
