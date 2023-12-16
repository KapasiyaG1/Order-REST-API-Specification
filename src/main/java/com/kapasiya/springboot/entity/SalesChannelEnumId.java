package com.kapasiya.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sales_channel_enum_id")
public class SalesChannelEnumId 
{
	@Id
	private Long saleschannelenumid;
	
	
	@Column(name ="web", nullable = false)
	private String web;
	
	
	@Column(name ="pos", nullable = false)
	private String pos;
	
	
	@Column(name ="fax", nullable = false)
	private String fax;
	
	
	@Column(name ="phone", nullable = false)
	private String phone;
	
	
	@Column(name ="email", nullable = false)
	private String email;

	@Column(name ="postalMail", nullable = false)
	private String postalMail;

	@Column(name ="affiliate", nullable = false)
	private String affiliate;
	
	@Column(name ="eBay", nullable = false)
	private String eBay;
	
	@Column(name ="amazon", nullable = false)
	private String amazon;
	
	@Column(name ="edit", nullable = false)
	private String edit;
	
	@Column(name ="oagis", nullable = false)
	private String oagis;
	
	@Column(name ="unknown_test_order", nullable = false)
	private String unknown_test_order;

	public Long getSaleschannelenumid() {
		return saleschannelenumid;
	}

	public void setSaleschannelenumid(Long saleschannelenumid) {
		this.saleschannelenumid = saleschannelenumid;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPostalMail() {
		return postalMail;
	}

	public void setPostalMail(String postalMail) {
		this.postalMail = postalMail;
	}

	public String getAffiliate() {
		return affiliate;
	}

	public void setAffiliate(String affiliate) {
		this.affiliate = affiliate;
	}

	public String geteBay() {
		return eBay;
	}

	public void seteBay(String eBay) {
		this.eBay = eBay;
	}

	public String getAmazon() {
		return amazon;
	}

	public void setAmazon(String amazon) {
		this.amazon = amazon;
	}

	public String getEdit() {
		return edit;
	}

	public void setEdit(String edit) {
		this.edit = edit;
	}

	public String getOagis() {
		return oagis;
	}

	public void setOagis(String oagis) {
		this.oagis = oagis;
	}

	public String getUnknown_test_order() {
		return unknown_test_order;
	}

	public void setUnknown_test_order(String unknown_test_order) {
		this.unknown_test_order = unknown_test_order;
	}

	public SalesChannelEnumId(Long saleschannelenumid, String web, String pos, String fax, String phone, String email,
			String postalMail, String affiliate, String eBay, String amazon, String edit, String oagis,
			String unknown_test_order) {
		super();
		this.saleschannelenumid = saleschannelenumid;
		this.web = web;
		this.pos = pos;
		this.fax = fax;
		this.phone = phone;
		this.email = email;
		this.postalMail = postalMail;
		this.affiliate = affiliate;
		this.eBay = eBay;
		this.amazon = amazon;
		this.edit = edit;
		this.oagis = oagis;
		this.unknown_test_order = unknown_test_order;
	}

	public SalesChannelEnumId() {
		super();
	}
	
	
	

}
