package com.clinic.controller;

import com.clinic.model.Doctor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/doctor")
public class ClinicRestController {

    @RequestMapping(value = {"/getListDoctor"}, method = RequestMethod.GET)
    public Doctor getListDoctor(@RequestParam Integer id) {
        Doctor doctor = new Doctor();
        doctor.setDoctorId(1);
        doctor.setName("Tien");
        doctor.setNameLogin("tienbk94");
        doctor.setSpecialist("Tien123");

        return doctor;
    }
}
