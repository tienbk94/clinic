package com.clinic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_bacsi")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer doctorId;
	private String nameLogin;
	private String lastName;
	private String specialist;
	private String firstName;
	
	public Doctor() {
		
	}

	public Doctor(String nameLogin, String lastName, String specialist, String firstName) {
		super();
		this.nameLogin = nameLogin;
		this.lastName = lastName;
		this.specialist = specialist;
		this.firstName = firstName;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public String getNameLogin() {
		return nameLogin;
	}

	public void setNameLogin(String nameLogin) {
		this.nameLogin = nameLogin;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
