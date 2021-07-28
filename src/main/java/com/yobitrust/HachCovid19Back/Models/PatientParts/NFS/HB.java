package com.yobitrust.HachCovid19Back.Models.PatientParts.NFS;

import java.util.Date;


public class HB {
    private Date datePr;
    private Double hb;

    public HB() {
    }

    public HB(Date datePr, Double hb) {
        this.datePr = datePr;
        this.hb = hb;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getHb() {
        return hb;
    }

    public void setHb(Double hb) {
        this.hb = hb;
    }
}

