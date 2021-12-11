package com.clinic.controller;

import com.clinic.model.Doctor;
import com.clinic.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/doctor")
public class ClinicRestController {

    @Autowired
    private IDoctorService doctorService;

    @GetMapping("/getDoctor")
    public Doctor getDoctor(@RequestParam Integer id) {

        return doctorService.findDoctorById(id);
    }

    @GetMapping("/getListDoctor")
    public List<Doctor> getListDoctor(@RequestParam String name, String nameLogin) {

        return doctorService.findDoctorByCondition(name, nameLogin);
    }
}
