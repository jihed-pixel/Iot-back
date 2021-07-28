package com.yobitrust.HachCovid19Back.Models.PatientParts.NFS;

import java.util.Date;

public class LYM {
    private Date datePr;
    private Double lym;

    public LYM() {
    }

    public LYM(Date datePr, Double lym) {
        this.datePr = datePr;
        this.lym = lym;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }


    public Double getLym() {
        return lym;
    }

    public void setLym(Double lym) {
        this.lym = lym;
    }


}

