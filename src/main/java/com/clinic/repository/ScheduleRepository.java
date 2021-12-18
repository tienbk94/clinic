package com.clinic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.clinic.model.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
	
	@Query("SELECT schedule, patient"
			+ " FROM Schedule schedule INNER JOIN Patient patient ON schedule.patientId = patient.patientId"
			+ " WHERE schedule.doctorId = :doctorId")
	List<Object[]> getScheduleByDoctor(Integer doctorId);
}
