package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class CREAT {
    private Date datePr;
    private Double creat;

    public CREAT() {
    }

    public CREAT(Date datePr, Double creat) {
        this.datePr = datePr;
        this.creat = creat;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getCreat() {
        return creat;
    }

    public void setCreat(Double creat) {
        this.creat = creat;
    }
}
