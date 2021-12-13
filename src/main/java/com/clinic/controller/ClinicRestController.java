package com.clinic.controller;

import com.clinic.model.Doctor;
import com.clinic.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/doctor")
public class ClinicRestController {

    @Autowired
    private IDoctorService doctorService;
    
    @PostMapping("/save")
    public Doctor saveDoctor(@RequestBody Doctor doctor) {
    	
    	return doctorService.saveEditDoctor(doctor);
    }

    @GetMapping("/getDoctor")
    public Doctor getDoctor(@RequestParam Integer id) {

        return doctorService.findDoctorById(id);
    }

    @GetMapping("/getListDoctor")
    public List<Doctor> getListDoctor(@RequestParam String name, String nameLogin) {

        return doctorService.findDoctorByCondition(name, nameLogin);
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
