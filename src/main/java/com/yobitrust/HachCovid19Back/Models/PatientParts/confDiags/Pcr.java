package com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags;

import com.yobitrust.HachCovid19Back.Models.PatientParts.ConfDiag;

import java.util.Date;

public class Pcr extends ConfDiag {
    private String test;
    private Date datePr;
    private String type;
    private String result;

    public Pcr(Date datePr, String type, String result,String test) {
        this.datePr = datePr;
        this.type = type;
        this.result = result;
        this.test = test;
    }

    public Pcr() {
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
