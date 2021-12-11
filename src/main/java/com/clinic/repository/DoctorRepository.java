package com.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinic.model.Doctor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

    @Query("SELECT doctor" +
            " FROM Doctor doctor" +
            " WHERE doctor.name = :name" +
            " AND doctor.nameLogin = :nameLogin")
    List<Doctor> findDoctorByCondition(String name, String nameLogin);
}
