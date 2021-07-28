package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class FACTEURV {
    private Date datePr;
    private Double facteurV;

    public FACTEURV() {
    }

    public FACTEURV(Date datePr, Double facteurV) {
        this.datePr = datePr;
        this.facteurV = facteurV;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getFacteurV() {
        return facteurV;
    }

    public void setFacteurV(Double facteurV) {
        this.facteurV = facteurV;
    }
}
