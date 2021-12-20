package com.clinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.model.Doctor;
import com.clinic.repository.DoctorRepository;

@Service
public class DoctorService implements IDoctorService {

	@Autowired
	private DoctorRepository repository;

	@Override
	public List<Doctor> getAll() {
		List<Doctor> doctors = repository.findAll();
		return doctors;
	}

	@Override
	public Doctor findDoctorById(int id) {
		Doctor editDoctor = repository.findById(id).orElseThrow(() -> new RuntimeException());
		return editDoctor;
	}

	@Override
	public Doctor saveEditDoctor(Doctor doctor) {
		return repository.save(doctor);
	
	}

	@Override
	public void deleteDoctor(Doctor doctor) {
		repository.delete(doctor);
	}

	@Override
	public List<Doctor> findDoctorByName(String doctorName) {
		return repository.findDoctorByName(doctorName);
	}

	@Override
	public List<Doctor> findDoctorByCondition(String specialist) {
		return repository.findDoctorByCondition(specialist);
	}

}
