package com.yobitrust.HachCovid19Back.Models.PatientParts.ExpoRisque;

import java.util.Date;

public class
Arrivee {
    private Date dateEnt;
    private String lieuEnt;
    private String moyensTran;

    public Arrivee() {
    }

    public Arrivee(Date dateEnt, String lieuEnt, String moyensTran) {
        this.dateEnt = dateEnt;
        this.lieuEnt = lieuEnt;
        this.moyensTran = moyensTran;
    }

    public Date getDateEnt() {
        return dateEnt;
    }

    public void setDateEnt(Date dateEnt) {
        this.dateEnt = dateEnt;
    }

    public String getLieuEnt() {
        return lieuEnt;
    }

    public void setLieuEnt(String lieuEnt) {
        this.lieuEnt = lieuEnt;
    }

    public String getMoyensTran() {
        return moyensTran;
    }

    public void setMoyensTran(String moyensTran) {
        this.moyensTran = moyensTran;
    }
}
