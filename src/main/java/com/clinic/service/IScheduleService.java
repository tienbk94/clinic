package com.clinic.service;

import java.util.List;

import com.clinic.model.Schedule;
import com.clinic.request.InformationForDoctor;
import com.clinic.request.PatientInfoDisplay;

public interface IScheduleService {
	
	List<Schedule> getAll();
	
	Schedule findScheduleById(Integer id);
	
	Schedule saveEditDoctor(Schedule schedule);
	
	void deleteSchedule(Schedule schedule);

	List<PatientInfoDisplay> getScheduleByDoctor(Integer doctorId);
	
	List<InformationForDoctor> getInformationForDoctor(String doctorName);
}
