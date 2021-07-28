package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class CPK_MB {
    private Date datePr;
    private Double cpk_mb;

    public CPK_MB() {
    }

    public CPK_MB(Date datePr, Double cpk_mb) {
        this.datePr = datePr;
        this.cpk_mb = cpk_mb;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getCpk_mb() {
        return cpk_mb;
    }

    public void setCpk_mb(Double cpk_mb) {
        this.cpk_mb = cpk_mb;
    }
}
