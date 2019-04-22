package com.clinic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.clinic.model.Doctor;

public interface DoctorRepository extends Repository<Doctor, Integer>{
	
	@Query("Select c from Doctor c")
	List<Doctor> getAll();
}
