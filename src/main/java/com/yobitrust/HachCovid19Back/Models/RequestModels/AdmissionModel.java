package com.yobitrust.HachCovid19Back.Models.RequestModels;

import java.util.Date;

public class AdmissionModel {
    private String type;
    private String lieu;
    private String hopital;
    private String service;
    private String mode;
    private Date dateEnt;

    public AdmissionModel() {
    }

    public AdmissionModel(String type, String lieu, String hopital, String service, String mode, Date dateEnt) {
        this.type = type;
        this.lieu = lieu;
        this.hopital = hopital;
        this.service = service;
        this.mode = mode;
        this.dateEnt = dateEnt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getHopital() {
        return hopital;
    }

    public void setHopital(String hopital) {
        this.hopital = hopital;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Date getDateEnt() {
        return dateEnt;
    }

    public void setDateEnt(Date dateEnt) {
        this.dateEnt = dateEnt;
    }

}
