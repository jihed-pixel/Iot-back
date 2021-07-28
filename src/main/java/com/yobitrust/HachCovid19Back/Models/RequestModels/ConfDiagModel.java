package com.yobitrust.HachCovid19Back.Models.RequestModels;

import java.util.Date;

public class ConfDiagModel {
    private String test;
    private Date datePr;
    private String type;
    private String result;

    public ConfDiagModel() {
    }


    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
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

    public ConfDiagModel(String test, Date datePr, String type, String result) {
        this.test = test;
        this.datePr = datePr;
        this.type = type;
        this.result = result;
    }
}
