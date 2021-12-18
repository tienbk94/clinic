package com.clinic.service;

import java.util.List;

import com.clinic.model.Patient;

public interface IPatientService {
	
	List<Patient> getAll();
	
	Patient findDoctorById(Integer id);
	
	Patient saveEditPatient(Patient patient);
	
	void deletePatient(Patient patient);
}
