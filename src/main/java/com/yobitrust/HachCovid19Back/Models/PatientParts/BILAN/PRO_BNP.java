package com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN;

import java.util.Date;

public class PRO_BNP {
    private Date datePr;
    private Double pro_bnp;

    public PRO_BNP() {
    }

    public PRO_BNP(Date datePr, Double pro_bnp) {
        this.datePr = datePr;
        this.pro_bnp = pro_bnp;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getPro_bnp() {
        return pro_bnp;
    }

    public void setPro_bnp(Double pro_bnp) {
        this.pro_bnp = pro_bnp;
    }
}
