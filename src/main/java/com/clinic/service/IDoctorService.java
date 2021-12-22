package com.clinic.service;

import java.util.List;

import com.clinic.model.Doctor;

public interface IDoctorService {
	
	List<Doctor> getAll();
	
	Doctor findDoctorById(int id);
	
	Doctor saveEditDoctor(Doctor doctor);
	
	void deleteDoctor(Doctor doctor);

	List<Doctor> findDoctorByName(String doctorName);
	
	List<Doctor> findDoctorByCondition(String specialist);
}
