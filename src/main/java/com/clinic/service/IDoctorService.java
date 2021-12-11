package com.clinic.service;

import java.util.List;

import com.clinic.model.Doctor;

public interface IDoctorService {
	
	List<Doctor> getAll();
	
	Doctor findDoctorById(int id);
	
	void saveEditDoctor(Doctor doctor);
	
	void deleteDoctor(Doctor doctor);
}
