package com.clinic.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_bacsi")
public class Doctor {

	@Id
	private int doctorId;
	private String nameLogin;
	private String name;
	private String specialist;
	
	public Doctor() {
		
	}
	
	public Doctor(String nameLogin, String name, String specialist) {
		super();
		this.nameLogin = nameLogin;
		this.name = name;
		this.specialist = specialist;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getNameLogin() {
		return nameLogin;
	}
	public void setNameLogin(String nameLogin) {
		this.nameLogin = nameLogin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	
	
}
