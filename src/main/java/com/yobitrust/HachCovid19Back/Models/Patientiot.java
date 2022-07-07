package com.yobitrust.HachCovid19Back.Models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;
import java.util.List;

@Document
public class Patientiot {
    @Id
    private String date ;
    private List<Float> v ;
    private List<Float> i ;
    public Patientiot() {
        this.v= new ArrayList<>();
        this.i=new ArrayList<>();
    }

    public Patientiot(String date, List<Float> v, List<Float> i) {
        this.date = date;
        this.v = v;
        this.i = i;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Float> getV() {
        return v;
    }

    public void setV(List<Float> v) {
        this.v = v;
    }

    public List<Float> getI() {
        return i;
    }

    public void setI(List<Float> i) {
        this.i = i;
    }
}
