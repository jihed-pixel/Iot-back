package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class TROPONINE {
    private Date datePr;
    private Double troponine;

    public TROPONINE() {
    }

    public TROPONINE(Date datePr, Double troponine) {
        this.datePr = datePr;
        this.troponine = troponine;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getTroponine() {
        return troponine;
    }

    public void setTroponine(Double troponine) {
        this.troponine = troponine;
    }
}
