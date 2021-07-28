package com.yobitrust.HachCovid19Back.Models.PatientParts.gdsa;

import java.util.Date;

public class PH {




    private Date datePr;
    private Double ph;

    public PH() {
    }

    public PH(Date datePr, Double ph) {
        this.datePr = datePr;
        this.ph = ph;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getPh() {
        return ph;
    }

    public void setPh(Double ph) {
        this.ph = ph;
    }
}


