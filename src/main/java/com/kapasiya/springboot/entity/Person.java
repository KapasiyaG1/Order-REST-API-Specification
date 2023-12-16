package com.kapasiya.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
public class Person 
{
	
	@Id
	private String partyId;
	
	
	@Column(name ="salutation", nullable = false)
	private String salutation;
	
	@Column(name ="firstName", nullable = false)
	private String firstName;
	
	@Column(name ="middleName", nullable = false)
	private String middleName;
	
	@Column(name ="lastName", nullable = false)
	private String lastName;

	@Column(name ="gender", nullable = false)
	private String gender;

	@Column(name ="birthDate", nullable = false)
	private String birthDate;

	@Column(name ="occupation", nullable = false)
	private String occupation;

	@Column(name ="maritalStatusEnumId", nullable = false)
	private String maritalStatusEnumId;

	@Column(name ="employmentStatusEnumId", nullable = false)
	private String employmentStatusEnumId;
	
	
	@ManyToOne
	@JoinColumn(name="partyId", nullable=false)
    private Party party;


	public String getPartyId() {
		return partyId;
	}


	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}


	public String getSalutation() {
		return salutation;
	}


	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	public String getMaritalStatusEnumId() {
		return maritalStatusEnumId;
	}


	public void setMaritalStatusEnumId(String maritalStatusEnumId) {
		this.maritalStatusEnumId = maritalStatusEnumId;
	}


	public String getEmploymentStatusEnumId() {
		return employmentStatusEnumId;
	}


	public void setEmploymentStatusEnumId(String employmentStatusEnumId) {
		this.employmentStatusEnumId = employmentStatusEnumId;
	}


//	public Party getParty() {
//		return party;
//	}
//
//
//	public void setParty(Party party) {
//		this.party = party;
//	}


	public Person(String partyId, String salutation, String firstName, String middleName, String lastName,
			String gender, String birthDate, String occupation, String maritalStatusEnumId,
			String employmentStatusEnumId, Party party) {
		super();
		this.partyId = partyId;
		this.salutation = salutation;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.occupation = occupation;
		this.maritalStatusEnumId = maritalStatusEnumId;
		this.employmentStatusEnumId = employmentStatusEnumId;
//		this.party = party;
	}


	public Person() {
		super();
	}

	

}
