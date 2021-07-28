package com.yobitrust.HachCovid19Back.Models.RequestModels;

import java.util.Date;

public class EvaluationModel {
    private Date dateSor;
    private Date dateDispSig;
    private Boolean deces;
    private String causesDir;
    private String causesIndir;

    public EvaluationModel() {
    }

    public EvaluationModel(Date dateSor, Date dateDispSig, Boolean deces, String causesDir, String causesIndir) {
        this.dateSor = dateSor;
        this.dateDispSig = dateDispSig;
        this.deces = deces;
        this.causesDir = causesDir;
        this.causesIndir = causesIndir;
    }

    public Date getDateSor() {
        return dateSor;
    }

    public void setDateSor(Date dateSor) {
        this.dateSor = dateSor;
    }

    public Date getDateDispSig() {
        return dateDispSig;
    }

    public void setDateDispSig(Date dateDispSig) {
        this.dateDispSig = dateDispSig;
    }

    public Boolean getDeces() {
        return deces;
    }

    public void setDeces(Boolean deces) {
        this.deces = deces;
    }

    public String getCausesDir() {
        return causesDir;
    }

    public void setCausesDir(String causesDir) {
        this.causesDir = causesDir;
    }

    public String getCausesIndir() {
        return causesIndir;
    }

    public void setCausesIndir(String causesIndir) {
        this.causesIndir = causesIndir;
    }

}
