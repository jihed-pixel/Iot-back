package com.yobitrust.HachCovid19Back.Models.PatientParts.NFS;

import com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio.Nfs;

import java.util.Date;



public class GB {
    private Date datePr;
    private Double gb;

    public GB() {
    }

    public GB(Date x, Double y) {
        this.datePr = datePr;
        this.gb = gb;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getGb() {
        return gb;
    }

    public void setGb(Double gb) {
        this.gb = gb;
    }
}

