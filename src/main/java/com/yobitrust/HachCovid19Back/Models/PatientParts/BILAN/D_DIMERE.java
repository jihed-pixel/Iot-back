package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class D_DIMERE {
    private Date datePr;
    private Double d_dimère;

    public D_DIMERE() {
    }

    public D_DIMERE(Date datePr, Double d_dimère) {
        this.datePr = datePr;
        this.d_dimère = d_dimère;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getD_dimère() {
        return d_dimère;
    }

    public void setD_dimère(Double d_dimère) {
        this.d_dimère = d_dimère;
    }
}
