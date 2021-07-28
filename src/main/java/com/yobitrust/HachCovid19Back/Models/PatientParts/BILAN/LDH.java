package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class LDH {
    private Date datePr;
    private Double ldh;

    public LDH() {
    }

    public LDH(Date datePr, Double ldh) {
        this.datePr = datePr;
        this.ldh = ldh;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getLdh() {
        return ldh;
    }

    public void setLdh(Double ldh) {
        this.ldh = ldh;
    }
}
