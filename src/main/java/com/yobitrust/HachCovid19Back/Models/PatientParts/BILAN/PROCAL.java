package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class PROCAL {
    private Date datePr;
    private Double procal;

    public PROCAL() {
    }

    public PROCAL(Date datePr, Double procal) {
        this.datePr = datePr;
        this.procal = procal;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getProcal() {
        return procal;
    }

    public void setProcal(Double procal) {
        this.procal = procal;
    }
}
