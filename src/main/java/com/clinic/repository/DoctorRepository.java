package com.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinic.model.Doctor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

    @Query("SELECT doctor" +
            " FROM Doctor doctor" +
            " WHERE CONCAT(doctor.firstName, ' ', doctor.lastName) LIKE %:doctorName%")
    List<Doctor> findDoctorByName(String doctorName);
    
    @Query("SELECT doctor" +
            " FROM Doctor doctor" +
            " WHERE doctor.specialist LIKE %:specialist%")
    List<Doctor> findDoctorByCondition(String specialist);
    
}
