package com.clinic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clinic.model.Doctor;
import com.clinic.service.IDoctorService;

@Controller
public class ClinicController {
	
	@Autowired
	IDoctorService doctorService;
	
	@RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
	public String index(Model model) {
		String message = "Hello Panda";
		model.addAttribute("message", message);
		return "index";
	}
	
	@RequestMapping(value = {"/doctorList"}, method = RequestMethod.GET)
	public String viewDoctorList(Model model) {
		
		List<Doctor> doctors = (List<Doctor>)doctorService.getAll();
		
		model.addAttribute("doctors", doctors);
		return "doctorList";
	}
}
