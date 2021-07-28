package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class FIBRINOGENE {
    private Date datePr;
    private Double fibrinogene;

    public FIBRINOGENE() {
    }

    public FIBRINOGENE(Date datePr, Double fibrinogene) {
        this.datePr = datePr;
        this.fibrinogene = fibrinogene;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getFibrinogene() {
        return fibrinogene;
    }

    public void setFibrinogene(Double fibrinogene) {
        this.fibrinogene = fibrinogene;
    }
}
