package com.yobitrust.HachCovid19Back.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Admin {
    private String username;
    private String password ;
    private String hospitalName;
    private String medicalServiceName ;
    private String address;
    public Admin() {
    }

    public Admin(String username, String password, String hospitalName, String medicalServiceName, String address) {
        this.username = username;
        this.password = password;
        this.hospitalName = hospitalName;
        this.medicalServiceName = medicalServiceName;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getMedicalServiceName() {
        return medicalServiceName;
    }

    public void setMedicalServiceName(String medicalServiceName) {
        this.medicalServiceName = medicalServiceName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
