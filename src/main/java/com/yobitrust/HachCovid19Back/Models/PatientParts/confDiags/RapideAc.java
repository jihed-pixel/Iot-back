package com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags;

import com.yobitrust.HachCovid19Back.Models.PatientParts.ConfDiag;

import java.util.Date;

public class RapideAc  extends ConfDiag {
    private String test;
    private Date datePr;
    private String result;

    public RapideAc() {
    }

    public RapideAc(Date datePr, String result,String test) {
        this.datePr = datePr;
        this.result = result;
        this.test = test;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
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
