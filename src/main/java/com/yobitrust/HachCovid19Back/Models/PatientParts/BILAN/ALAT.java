package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class ALAT {
    private Date datePr;
    private Double alat;

    public ALAT() {
    }

    public ALAT(Date datePr, Double alat) {
        this.datePr = datePr;
        this.alat = alat;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getAlat() {
        return alat;
    }

    public void setAlat(Double alat) {
        this.alat = alat;
    }
}

