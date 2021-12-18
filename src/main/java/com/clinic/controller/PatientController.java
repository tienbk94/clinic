package com.clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.model.Patient;
import com.clinic.service.IPatientService;

@RestController
@RequestMapping("/rest/patient")
public class PatientController {
	@Autowired
	IPatientService patientService;
	
	@GetMapping("/getAll")
	public List<Patient> getAll(){
		List<Patient> patients = patientService.getAll();
		return patients;
	}
	
	@PostMapping("/savePatient")
	public Patient savePatient(@RequestBody Patient patient) {
		
		Patient newPatient = patientService.saveEditPatient(patient);
		
		return newPatient;
	}
}
