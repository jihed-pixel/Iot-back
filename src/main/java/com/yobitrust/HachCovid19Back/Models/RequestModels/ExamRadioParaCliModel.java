package com.yobitrust.HachCovid19Back.Models.RequestModels;

import java.util.Date;

public class ExamRadioParaCliModel {
    private Date datepr;
    private String result;
    private String espaceQT;
    private String aspect;
    private Integer nbQua;
    private String type;

    public ExamRadioParaCliModel() {
    }

    public ExamRadioParaCliModel(Date datepr, String result, String espaceQT, String aspect, Integer nbQua, String type) {
        this.datepr = datepr;
        this.result = result;
        this.espaceQT = espaceQT;
        this.aspect = aspect;
        this.nbQua = nbQua;
        this.type = type;
    }

    public Date getDatepr() {
        return datepr;
    }

    public void setDatepr(Date datepr) {
        this.datepr = datepr;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getEspaceQT() {
        return espaceQT;
    }

    public void setEspaceQT(String espaceQT) {
        this.espaceQT = espaceQT;
    }

    public String getAspect() {
        return aspect;
    }

    public void setAspect(String aspect) {
        this.aspect = aspect;
    }

    public Integer getNbQua() {
        return nbQua;
    }

    public void setNbQua(Integer nbQua) {
        this.nbQua = nbQua;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
