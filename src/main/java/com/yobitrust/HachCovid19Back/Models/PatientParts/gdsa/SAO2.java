package com.yobitrust.HachCovid19Back.Models.PatientParts.gdsa;

import java.util.Date;

public class SAO2 {




    private Date datePr;
    private Double sao2;

    public SAO2() {
    }

    public SAO2(Date datePr, Double sao2) {
        this.datePr = datePr;
        this.sao2 = sao2;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getSao2() {
        return sao2;
    }

    public void setSao2(Double sao2) {
        this.sao2 = sao2;
    }
}

