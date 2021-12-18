package com.clinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.model.Schedule;
import com.clinic.repository.ScheduleRepository;

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
	public List<Schedule> getScheduleByDoctor(Integer doctorId) {
		List<Schedule> schedules = scheduleRepository.getScheduleByDoctor(doctorId);
		return schedules;
	}

}
