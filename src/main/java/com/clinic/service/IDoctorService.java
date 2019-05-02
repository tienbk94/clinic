package com.clinic.service;

import java.util.List;

import com.clinic.model.Doctor;

public interface IDoctorService {
	
	public List<Doctor> getAll();
	
	public Doctor findDoctorById(int id);
	
	public void saveEditDoctor(Doctor doctor);
	
	public void deleteDoctor(Doctor doctor);
}
