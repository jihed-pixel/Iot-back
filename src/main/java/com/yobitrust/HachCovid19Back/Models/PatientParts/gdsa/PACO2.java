package com.yobitrust.HachCovid19Back.Models.PatientParts.gdsa;

import java.util.Date;

public class PACO2 {


    private Date datePr;
    private Double paco2;

    public PACO2() {
    }

    public PACO2(Date datePr, Double paco2) {
        this.datePr = datePr;
        this.paco2 = paco2;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getPaco2() {
        return paco2;
    }

    public void setPaco2(Double paco2) {
        this.paco2 = paco2;
    }
}

