package com.yobitrust.HachCovid19Back.Controllers;

import com.yobitrust.HachCovid19Back.Models.Admin;
import com.yobitrust.HachCovid19Back.Models.MedicalService;
import com.yobitrust.HachCovid19Back.Models.RequestModels.LoginRequestModel;
import com.yobitrust.HachCovid19Back.Repositories.AdminRepository;
import com.yobitrust.HachCovid19Back.Repositories.MedicalServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @GetMapping("/logoutAdmin")
    public ResponseEntity logout(){
        System.out.println("logout");
        return  ResponseEntity.ok(null);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/ccAdmin")
    public String addAdmin(@RequestBody LoginRequestModel model){

        Admin service= new Admin();

        System.out.println(model.getPassword() +"   "+model.getUsername());
        service.setUsername(model.getUsername());
        service.setPassword(model.getPassword());
        adminRepository.save(service);
        return "ok";
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/loginadmin")
    public ResponseEntity login(@RequestBody LoginRequestModel model)
    {
        System.out.println(model.getPassword()+" "+model.getUsername());
        if (model==null ||model.getPassword()==null || model.getUsername() ==null)
            return ResponseEntity.ok("Please enter the password and the username");
        // System.out.println(password);
        Admin admin=adminRepository.findByUsernameAndPassword(model.getUsername(),model.getPassword());
        System.out.println(admin);
        if(admin ==null){
            return   ResponseEntity.ok("Username or/and password is/are incorrect");
        }

        System.out.println(admin.toString());
        return  ResponseEntity.ok(admin);
    }
}

