package com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA;

import java.util.Date;

public class NAk {


    private Date datePr;
    private Double nka;

    public NAk() {
    }

    public NAk(Date datePr, Double nka) {
        this.datePr = datePr;
        this.nka = nka;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getNka() {
        return nka;
    }

    public void setNka(Double nka) {
        this.nka = nka;
    }
}

