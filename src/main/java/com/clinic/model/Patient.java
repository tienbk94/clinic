package com.clinic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_benhnhan")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer patientId;
	private String patientName;
	private int patientAge;
	private String address;
	private String patientContact;
	
	public Patient() {
		
	}
	
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getPatientContact() {
		return patientContact;
	}

	public void setPatientContact(String patientContact) {
		this.patientContact = patientContact;
	}
	
	
}
