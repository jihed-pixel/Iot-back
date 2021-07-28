package com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA;

import java.util.Date;

public class NAK1 {
    private Date datePr;
    private Double nka1;
    public NAK1() {
    }

    public NAK1(Date datePr, Double nka1) {
        this.datePr = datePr;
        this.nka1 = nka1;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getNka1() {
        return nka1;
    }

    public void setNka1(Double nka1) {
        this.nka1 = nka1;
    }
}
