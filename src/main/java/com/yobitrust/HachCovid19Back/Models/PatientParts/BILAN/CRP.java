package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class CRP {
    private Date datePr;
    private Double crp;

    public CRP() {
    }

    public CRP(Date datePr, Double crp) {
        this.datePr = datePr;
        this.crp = crp;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getCrp() {
        return crp;
    }

    public void setCrp(Double crp) {
        this.crp = crp;
    }
}
