package com.clinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.model.Doctor;
import com.clinic.repository.DoctorRepository;

@Service
public class DoctorService implements IDoctorService{

	@Autowired
	private DoctorRepository repository;
	
	@Override
	public List<Doctor> getAll() {
		List<Doctor> doctors = repository.getAll();
		return doctors;
	}
	
	

}
