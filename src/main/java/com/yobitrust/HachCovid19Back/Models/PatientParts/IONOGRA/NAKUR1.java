package com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA;

import java.util.Date;

public class NAKUR1 {


    private Date datePr;
    private Double nakur1;

    public NAKUR1() {
    }

    public NAKUR1(Date datePr, Double nakur1) {
        this.datePr = datePr;
        this.nakur1 = nakur1;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getNakur1() {
        return nakur1;
    }

    public void setNakur1(Double nakur1) {
        this.nakur1 = nakur1;
    }
}


