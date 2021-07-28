package com.yobitrust.HachCovid19Back.Models.PatientParts.NFS;

import java.util.Date;


public class HT {
    private Date datePr;
    private Double ht;

    public HT() {
    }

    public HT(Date datePr, Double ht) {
        this.datePr = datePr;
        this.ht = ht;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getHt() {
        return ht;
    }

    public void setHt(Double ht) {
        this.ht = ht;
    }
}

