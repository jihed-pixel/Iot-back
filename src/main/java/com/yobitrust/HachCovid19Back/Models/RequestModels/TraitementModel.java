package com.yobitrust.HachCovid19Back.Models.RequestModels;

import java.util.Date;

public class TraitementModel {
    private Boolean trait;
    private String pactt;
    private String type;
    private String dosage;//dosage ou debit
    private Date dateD;
    private Date dateF;
    private String autre;


    public TraitementModel() {
    }

    public TraitementModel(Boolean trait, String pactt, String type, String dosage, Date dateD, Date dateF, String autre) {
        this.trait = trait;
        this.pactt = pactt;
        this.type = type;
        this.dosage = dosage;
        this.dateD = dateD;
        this.dateF = dateF;
        this.autre = autre;
    }

    public Boolean getTrait() {
        return trait;
    }

    public void setTrait(Boolean trait) {
        this.trait = trait;
    }

    public String getPactt() {
        return pactt;
    }

    public void setPactt(String pactt) {
        this.pactt = pactt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public Date getDateF() {
        return dateF;
    }

    public void setDateF(Date dateF) {
        this.dateF = dateF;
    }

    public String getAutre() {
        return autre;
    }

    public void setAutre(String autre) {
        this.autre = autre;
    }
}
