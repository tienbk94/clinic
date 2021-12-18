package com.clinic.model;

import java.util.Date;

public class PatientInfoDisplay {
	
	private String patientName;
	private int patientAge;
	private String address;
	private Date scheduleTime;
	
	public PatientInfoDisplay() {
		
	}
	
	public PatientInfoDisplay(String patientName, int patientAge, String address, Date scheduleTime) {
		super();
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.address = address;
		this.scheduleTime = scheduleTime;
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
	public Date getScheduleTime() {
		return scheduleTime;
	}
	public void setScheduleTime(Date scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	
	
}
