package com.clinic.model;

public class Doctor {

	private int ID_doctor;
	private String nameLogin;
	private String name;
	private String specialist;
	
	public Doctor(int id, String nameLogin, String name, String specialist) {
		this.ID_doctor = id;
		this.nameLogin = nameLogin;
		this.name = name;
		this.specialist = specialist;
	}
	
	public int getID_doctor() {
		return ID_doctor;
	}
	public void setID_doctor(int iD_doctor) {
		this.ID_doctor = iD_doctor;
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
	
}
