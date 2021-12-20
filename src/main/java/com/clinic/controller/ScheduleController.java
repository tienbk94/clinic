package com.clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.model.Schedule;
import com.clinic.request.InformationForDoctor;
import com.clinic.request.PatientInfoDisplay;
import com.clinic.service.IScheduleService;

@RestController
@RequestMapping("/rest/schedule")
public class ScheduleController {
	
	@Autowired
	IScheduleService scheduleService;
	
	@GetMapping("/getAll")
	public List<Schedule> getAll() {
		List<Schedule> schedules = scheduleService.getAll();
		
		return schedules;
	}
	
	@PostMapping("/createSchedule")
	public Schedule createSchedule(@RequestBody Schedule schedule) {
		Schedule newSchedule = scheduleService.saveEditDoctor(schedule);
		return newSchedule;
	}
	
	@GetMapping("/getScheduleByDoctor")
	public List<PatientInfoDisplay> getScheduleByDoctor(@RequestParam Integer doctorId) {
		List<PatientInfoDisplay> patientInfoDisplay = scheduleService.getScheduleByDoctor(doctorId);
		return patientInfoDisplay;
	}
	
	@GetMapping("/getInformationForDoctor")
	public List<InformationForDoctor> getInformationForDoctor(@RequestParam String doctorName) {
		List<InformationForDoctor> informationForDoctors = scheduleService.getInformationForDoctor(doctorName);
		return informationForDoctors;
	}
}
