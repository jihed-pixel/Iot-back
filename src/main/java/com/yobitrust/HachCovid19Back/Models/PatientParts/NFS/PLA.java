package com.yobitrust.HachCovid19Back.Models.PatientParts.NFS;

import java.util.Date;


public class PLA {
    private Date datePr;
    private Double pla;

    public PLA() {
    }

    public PLA(Date datePr, Double pla) {
        this.datePr = datePr;
        this.pla = pla;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getPla() {
        return pla;
    }

    public void setPla(Double pla) {
        this.pla = pla;
    }
}

