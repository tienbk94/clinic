package com.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinic.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{
	
}
