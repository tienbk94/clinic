package com.clinic.request;

import java.util.Date;

public class InformationForDoctor {
	private Integer doctorId;
	private String doctorFullName;
	private Date scheduleTime;
	private String patientName;
	
	public InformationForDoctor(Integer doctorId, String doctorFullName, Date scheduleTime, String patientName) {
		super();
		this.doctorId = doctorId;
		this.doctorFullName = doctorFullName;
		this.scheduleTime = scheduleTime;
		this.patientName = patientName;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorFullName() {
		return doctorFullName;
	}

	public void setDoctorFullName(String doctorFullName) {
		this.doctorFullName = doctorFullName;
	}

	public Date getScheduleTime() {
		return scheduleTime;
	}

	public void setScheduleTime(Date scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
}
