package com.clinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.model.Patient;
import com.clinic.repository.PatientRepository;

@Service
public class PatientService implements IPatientService {

	@Autowired
	PatientRepository patientRepository;
	
	@Override
	public List<Patient> getAll() {
		List<Patient> patients = patientRepository.findAll();
		return patients;
	}

	@Override
	public Patient findDoctorById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient saveEditPatient(Patient patient) {
		Patient newPatient = patientRepository.save(patient);
		return newPatient;
	}

	@Override
	public void deletePatient(Patient patient) {
		// TODO Auto-generated method stub

	}

}
