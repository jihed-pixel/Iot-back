package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class ASAT {
    private Date datePr;
    private Double asat;

    public ASAT() {
    }

    public ASAT(Date datePr, Double asat) {
        this.datePr = datePr;
        this.asat = asat;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getAsat() {
        return asat;
    }

    public void setAsat(Double asat) {
        this.asat = asat;
    }
}
