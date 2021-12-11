package com.clinic.controller;

import com.clinic.model.Doctor;
import com.clinic.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/doctor")
public class ClinicRestController {

    @Autowired
    private IDoctorService doctorService;

    @GetMapping("/getListDoctor")
    public Doctor getListDoctor(@RequestParam Integer id) {

        return doctorService.findDoctorById(id);
    }
}
