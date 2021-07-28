package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class PATHS {
    private Date datePr;
    private Double paths;

    public PATHS() {
    }

    public PATHS(Date datePr, Double paths) {
        this.datePr = datePr;
        this.paths = paths;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getPaths() {
        return paths;
    }

    public void setPaths(Double paths) {
        this.paths = paths;
    }
}
