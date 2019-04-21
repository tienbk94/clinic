package com.clinic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clinic.model.Doctor;

@Controller
public class ClinicController {
	private static List<Doctor> doctor = new ArrayList<Doctor>();
	
	static {
		doctor.add(new Doctor(1, "tuan", "Tuan", "rhm"));
		doctor.add(new Doctor(2, "huyen", "Huyen", "dk"));
	}
	
	@RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
	public String index(Model model) {
		String message = "Hello Panda";
		model.addAttribute("message", message);
		return "index";
	}
}
