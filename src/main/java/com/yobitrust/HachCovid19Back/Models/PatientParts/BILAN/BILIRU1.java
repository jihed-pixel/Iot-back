package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class BILIRU1 {
    private Date datePr;
    private Double biliru1;

    public BILIRU1() {
    }

    public BILIRU1(Date datePr, Double biliru1) {
        this.datePr = datePr;
        this.biliru1 = biliru1;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getBiliru1() {
        return biliru1;
    }

    public void setBiliru1(Double biliru1) {
        this.biliru1 = biliru1;
    }
}
