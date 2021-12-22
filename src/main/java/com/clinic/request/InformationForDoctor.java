package com.clinic.request;

public class InformationForDoctor {
	private Integer doctorId;
	private String doctorFullName;
	private String patientName;
	
	public InformationForDoctor(Integer doctorId, String doctorFullName, String patientName) {
		super();
		this.doctorId = doctorId;
		this.doctorFullName = doctorFullName;
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

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
}
