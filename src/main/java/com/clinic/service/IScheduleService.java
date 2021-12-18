package com.clinic.service;

import java.util.List;

import com.clinic.model.PatientInfoDisplay;
import com.clinic.model.Schedule;

public interface IScheduleService {
	
	List<Schedule> getAll();
	
	Schedule findScheduleById(Integer id);
	
	Schedule saveEditDoctor(Schedule schedule);
	
	void deleteSchedule(Schedule schedule);

	List<PatientInfoDisplay> getScheduleByDoctor(Integer doctorId);
}
