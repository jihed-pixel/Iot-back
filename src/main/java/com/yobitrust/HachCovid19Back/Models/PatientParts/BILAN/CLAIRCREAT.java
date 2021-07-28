package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class CLAIRCREAT {
    private Date datePr;
    private Double clairCreat;

    public CLAIRCREAT() {
    }

    public CLAIRCREAT(Date datePr, Double clairCreat) {
        this.datePr = datePr;
        this.clairCreat = clairCreat;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getClairCreat() {
        return clairCreat;
    }

    public void setClairCreat(Double clairCreat) {
        this.clairCreat = clairCreat;
    }
}
