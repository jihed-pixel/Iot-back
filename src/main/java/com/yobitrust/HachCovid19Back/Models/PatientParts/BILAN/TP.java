package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class TP {
    private Date datePr;
    private Double tp;

    public TP() {
    }

    public TP(Date datePr, Double tp) {
        this.datePr = datePr;
        this.tp = tp;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getTp() {
        return tp;
    }

    public void setTp(Double tp) {
        this.tp = tp;
    }
}
