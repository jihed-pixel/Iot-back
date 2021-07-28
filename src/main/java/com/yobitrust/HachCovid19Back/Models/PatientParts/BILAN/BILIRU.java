package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class BILIRU {
    private Date datePr;
    private Double biliru;

    public BILIRU() {
    }

    public BILIRU(Date datePr, Double biliru) {
        this.datePr = datePr;
        this.biliru = biliru;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getBiliru() {
        return biliru;
    }

    public void setBiliru(Double biliru) {
        this.biliru = biliru;
    }
}
