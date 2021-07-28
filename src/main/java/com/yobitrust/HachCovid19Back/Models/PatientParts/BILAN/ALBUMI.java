package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class ALBUMI {
    private Date datePr;
    private Double albumi;

    public ALBUMI() {
    }

    public ALBUMI(Date datePr, Double albumi) {
        this.datePr = datePr;
        this.albumi = albumi;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getAlbumi() {
        return albumi;
    }

    public void setAlbumi(Double albumi) {
        this.albumi = albumi;
    }
}
