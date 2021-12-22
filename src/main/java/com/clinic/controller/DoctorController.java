package com.clinic.controller;

import com.clinic.model.Doctor;
import com.clinic.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/doctor")
public class DoctorController {

    @Autowired
    private IDoctorService doctorService;
    
    @PostMapping("/saveDoctor")
    public Doctor saveDoctor(@RequestBody Doctor doctor) {
    	
    	return doctorService.saveEditDoctor(doctor);
    }

    @GetMapping("/getDoctorById")
    public Doctor getDoctor(@RequestParam Integer id) {

        return doctorService.findDoctorById(id);
    }

    @GetMapping("/getDoctorByName")
    public List<Doctor> getListDoctor(@RequestParam String doctorName) {

        return doctorService.findDoctorByName(doctorName);
    }
    
    @GetMapping("/getAllDoctor")
    public List<Doctor> getAllDoctor(){
    	return doctorService.getAll();
    }
    
    @GetMapping("/getDotorBySpec")
    public List<Doctor> getListDoctorBySpec(@RequestParam String specialist){
    	return doctorService.findDoctorByCondition(specialist);
    }
}
