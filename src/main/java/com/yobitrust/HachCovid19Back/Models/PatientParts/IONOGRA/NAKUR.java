package com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA;

import java.util.Date;

public class NAKUR {


    private Date datePr;
    private Double nakur;

    public NAKUR() {
    }

    public NAKUR(Date datePr, Double nakur) {
        this.datePr = datePr;
        this.nakur = nakur;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getNakur() {
        return nakur;
    }

    public void setNakur(Double nakur) {
        this.nakur = nakur;
    }
}

