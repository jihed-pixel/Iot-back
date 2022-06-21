package com.yobitrust.HachCovid19Back.Controllers;
import com.sun.jdi.VoidType;
import com.yobitrust.HachCovid19Back.Models.AddDate;
import com.yobitrust.HachCovid19Back.Models.Patient;
import com.yobitrust.HachCovid19Back.Repositories.DateRepository;
import com.yobitrust.HachCovid19Back.Repositories.PatientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

@RestController
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private DateRepository dateRepository;



    @CrossOrigin(origins ="*" )
    @PostMapping("/addPatient")
    public ResponseEntity addPatient(@RequestBody Patient model) {
        Patient patient = patientRepository.findByDate(model.getDate());
        if (patient != null)
            return ResponseEntity.ok("date already existed");
        Patient newPatient = new Patient();
        newPatient.setDate(model.getDate());
        newPatient.setI(model.getI());
        newPatient.setV(model.getV());
        patientRepository.save(newPatient);
        return ResponseEntity.ok("Patient added successfuly");
    }
    @CrossOrigin(origins ="*" )
    @GetMapping("/getAllPatients")
    public ResponseEntity getAllPatients(){
        List<Patient> patients= patientRepository.findAll();
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
        Patient patient=patientRepository.findByDate(date);
        if(patient==null) return ResponseEntity.ok("No patient having \""+date+"\"as date ");
        return ResponseEntity.ok(patient);
    }

    }





