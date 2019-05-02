package com.clinic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value = {"/editDoctor/{id}"}, method = RequestMethod.GET)
	public String editDoctorForm(Model model, @PathVariable(required = false, name = "id") int id) {
		
		model.addAttribute("editDoctor", doctorService.findDoctorById(id));
		
		return "editForm";
	}
	
	@RequestMapping(value = {"/addNewDoctor"}, method = RequestMethod.GET)
	public String addNewDoctor(Model model, Doctor newDoctor) {
		
		model.addAttribute("newDoctor", newDoctor);
		return "addNewDoctor";
	}
	
	@RequestMapping(value = "/updateDoctor", method = RequestMethod.POST)
	public String editDoctor(Doctor editDoctor, Model model) {
		
		doctorService.saveEditDoctor(editDoctor);
		model.addAttribute("doctors", doctorService.getAll());
	    return "doctorList";
	}
	
	@RequestMapping(value = "/createDoctor", method = RequestMethod.POST)
	public String createDoctor(Doctor newDoctor, Model model) {
		doctorService.saveEditDoctor(newDoctor);
		model.addAttribute("doctors", doctorService.getAll());
		return "doctorList";
	}
	
	@RequestMapping(value="/deleteDoctor/{id}", method = RequestMethod.GET)
    public String deleteDoctor(Model model, @PathVariable(required = true, name = "id") int id) {
        doctorService.deleteDoctor(doctorService.findDoctorById(id));
        model.addAttribute("doctors", doctorService.getAll());
        return "doctorList";
    }
}
