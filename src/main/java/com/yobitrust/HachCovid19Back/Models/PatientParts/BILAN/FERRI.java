package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class FERRI {
    private Date datePr;
    private Double ferri;

    public FERRI() {
    }

    public FERRI(Date datePr, Double ferri) {
        this.datePr = datePr;
        this.ferri = ferri;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getFerri() {
        return ferri;
    }

    public void setFerri(Double ferri) {
        this.ferri = ferri;
    }
}
