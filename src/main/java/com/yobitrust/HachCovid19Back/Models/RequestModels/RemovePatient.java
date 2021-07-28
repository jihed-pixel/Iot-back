package com.yobitrust.HachCovid19Back.Models.RequestModels;

public class RemovePatient {
    private String patient;
    public RemovePatient() {
    }
    public RemovePatient(String patient) {
        this.patient = patient;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }
}
