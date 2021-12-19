package com.clinic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.model.Patient;
import com.clinic.model.Schedule;
import com.clinic.repository.ScheduleRepository;
import com.clinic.request.PatientInfoDisplay;

@Service
public class ScheduleService implements IScheduleService{
	
	@Autowired
	ScheduleRepository scheduleRepository;
	
	@Override
	public List<Schedule> getAll() {
		
		return scheduleRepository.findAll();
	}

	@Override
	public Schedule findScheduleById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schedule saveEditDoctor(Schedule schedule) {
		return scheduleRepository.save(schedule);
	}

	@Override
	public void deleteSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PatientInfoDisplay> getScheduleByDoctor(Integer doctorId) {
		List<Object[]> objects = scheduleRepository.getScheduleByDoctor(doctorId);
		List<PatientInfoDisplay> patientInfoDisplays = new ArrayList<>();
		for(Object[] object : objects) {
			Schedule schedule = (Schedule) object[0];
			Patient patient = (Patient) object[1];
			
			patientInfoDisplays.add(new PatientInfoDisplay(patient.getPatientName(), 
														   patient.getPatientAge(), 
														   patient.getAddress(), 
														   schedule.getScheduleTime()));
			
		}
		
		return patientInfoDisplays;
	}

}
