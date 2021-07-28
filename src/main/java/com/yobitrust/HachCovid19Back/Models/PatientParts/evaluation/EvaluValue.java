package com.yobitrust.HachCovid19Back.Models.PatientParts.evaluation;

import java.util.Date;

public class EvaluValue {
    private Date time;
    private Date value;
    private Date value1;
    private Date value2;

    public EvaluValue(Date time, Date value , Date value1 , Date value2) {
        this.time = time;
        this.value = value;
    }

    public EvaluValue() {
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getValue() {
        return value;
    }

    public void setValue(Date value) {
        this.value = value;
    }

    public Date getValue1() {
        return value1;
    }

    public void setValue1(Date value1) {
        this.value1 = value1;
    }

    public Date getValue2() {
        return value2;
    }

    public void setValue2(Date value2) {
        this.value2 = value2;
    }
}
