package com.yobitrust.HachCovid19Back.Models.PatientParts.gdsa;

import java.util.Date;

public class HCO3 {


    private Date datePr;
    private Double hco3;

    public HCO3() {
    }

    public HCO3(Date datePr, Double hco3) {
        this.datePr = datePr;
        this.hco3 = hco3;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getHco3() {
        return hco3;
    }

    public void setHco3(Double hco3) {
        this.hco3 = hco3;
    }
}

