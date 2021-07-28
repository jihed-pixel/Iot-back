package com.yobitrust.HachCovid19Back.Models.PatientParts.gdsa;

import java.util.Date;

public class PAO2 {

    private Date datePr;
    private Double pao2;

    public PAO2() {
    }

    public PAO2(Date datePr, Double pao2) {
        this.datePr = datePr;
        this.pao2 = pao2;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getPao2() {
        return pao2;
    }

    public void setPao2(Double pao2) {
        this.pao2 = pao2;
    }
}

