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

	public Doctor(int id, String nameLogin, String name, String specialist) {
		this.doctorId = id;
		this.nameLogin = nameLogin;
		this.name = name;
		this.specialist = specialist;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int iD_doctor) {
		this.doctorId = iD_doctor;
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

	public String getNameLogin() {
		return nameLogin;
	}

	public void setNameLogin(String nameLogin) {
		this.nameLogin = nameLogin;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		builder.append("Doctor{id=").append(doctorId).append(", nameLogin=").append(nameLogin).append(", name=")
				.append(name).append(", specialist=").append(specialist).append("}");
		return builder.toString();
	}
}
