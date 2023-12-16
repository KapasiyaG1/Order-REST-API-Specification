package com.kapasiya.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "PartyTypeEnumId")
public class PartyTypeEnumId 
{
	
	@Id
	private String partyid;
	
	@Column(name ="pty_automated_agen", nullable = false)
    private String pty_automated_agen;
	
	@Column(name ="pty_person", nullable = false)
	private String pty_person;
	
	@Column(name ="pty_organization", nullable = false)
	private String pty_organization;

	public String getPty_automated_agen() {
		return pty_automated_agen;
	}

	public void setPty_automated_agen(String pty_automated_agen) {
		this.pty_automated_agen = pty_automated_agen;
	}

	public String getPty_person() {
		return pty_person;
	}

	public void setPty_person(String pty_person) {
		this.pty_person = pty_person;
	}

	public String getPty_organization() {
		return pty_organization;
	}

	public void setPty_organization(String pty_organization) {
		this.pty_organization = pty_organization;
	}

	public PartyTypeEnumId(String pty_automated_agen, String pty_person, String pty_organization) {
		super();
		this.pty_automated_agen = pty_automated_agen;
		this.pty_person = pty_person;
		this.pty_organization = pty_organization;
	}

	public PartyTypeEnumId() {
		super();
	}

	
	
}
