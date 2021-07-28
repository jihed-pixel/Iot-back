package com.yobitrust.HachCovid19Back.Controllers;

import com.yobitrust.HachCovid19Back.Models.RequestModels.LoginRequestModel;
import com.yobitrust.HachCovid19Back.Models.MedicalService;
import com.yobitrust.HachCovid19Back.Repositories.MedicalServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MedicalServiceController {
    @Autowired
    private MedicalServiceRepository medicalServiceRepository;
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @GetMapping("/logout")
    public ResponseEntity logout(){
        System.out.println("logout");
        return  ResponseEntity.ok(null);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/cc")
    public String addMedicalService(@RequestBody  LoginRequestModel model){

        MedicalService  service= new MedicalService();

        System.out.println(model.getPassword() +"   "+model.getUsername());
        service.setUsername(model.getUsername());
        service.setPassword(model.getPassword());
        medicalServiceRepository.save(service);
        return "ok";
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginRequestModel model)
    {
        System.out.println(model.getPassword()+" "+model.getUsername());
        if (model==null ||model.getPassword()==null || model.getUsername() ==null)
            return ResponseEntity.ok("Please enter the password and the username");
       // System.out.println(password);
        MedicalService medicalService=medicalServiceRepository.findByUsernameAndPassword(model.getUsername(),model.getPassword());
        System.out.println(medicalService);
        if(medicalService ==null){
            return   ResponseEntity.ok("Username or/and password is/are incorrect");
        }

       System.out.println(medicalService.toString());
        return  ResponseEntity.ok(medicalService);
    }
}
