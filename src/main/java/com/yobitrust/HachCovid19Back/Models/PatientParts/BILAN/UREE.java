package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class UREE {
    private Date datePr;
    private Double uree;

    public UREE() {
    }

    public UREE(Date datePr, Double uree) {
        this.datePr = datePr;
        this.uree = uree;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getUree() {
        return uree;
    }

    public void setUree(Double uree) {
        this.uree = uree;
    }
}
