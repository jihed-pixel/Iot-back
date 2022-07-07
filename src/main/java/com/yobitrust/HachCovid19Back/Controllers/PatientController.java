package com.yobitrust.HachCovid19Back.Controllers;
import com.yobitrust.HachCovid19Back.Models.AddDate;
import com.yobitrust.HachCovid19Back.Models.Patientiot;
import com.yobitrust.HachCovid19Back.Repositories.DateRepository;
import com.yobitrust.HachCovid19Back.Repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private DateRepository dateRepository;



    @CrossOrigin(origins ="*" )
    @PostMapping("/addPatient")
    public ResponseEntity addPatient(@RequestBody Patientiot model) {
        Patientiot patient = patientRepository.findByDate(model.getDate());
        if (patient != null)
            return ResponseEntity.ok("date already existed");
        Patientiot newPatient = new Patientiot();
        newPatient.setDate(model.getDate());
        newPatient.setI(model.getI());
        newPatient.setV(model.getV());
        patientRepository.save(newPatient);
        return ResponseEntity.ok("Patient added successfuly");
    }
    @CrossOrigin(origins ="*" )
    @GetMapping("/getAllPatients")
    public ResponseEntity getAllPatients(){
        List<Patientiot> patients= patientRepository.findAll();
        return ResponseEntity.ok(patients);
    }
    @CrossOrigin(origins ="*" )
    @GetMapping("/getAllDate")
    public ResponseEntity getAllDate(){
        List<AddDate> addDate= dateRepository.findAll();
        return ResponseEntity.ok(addDate);
    }
    @CrossOrigin(origins ="*" )
    @GetMapping("/search/{date}")
    public ResponseEntity searchPatient(@PathVariable String date){
        Patientiot patient=patientRepository.findByDate(date);
        if(patient==null) return ResponseEntity.ok("No patient having \""+date+"\"as date ");
        return ResponseEntity.ok(patient);
    }

    }





