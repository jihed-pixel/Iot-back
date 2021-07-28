package com.yobitrust.HachCovid19Back.Models.PatientParts.traitement;

import java.util.Date;
import java.util.List;

public class TraitementPart {
    private Date dateD;
    private Date dateF;
    public TraitementPart() {
    }

    public TraitementPart(Date dateD, Date dateF) {
        this.dateD = dateD;
        this.dateF = dateF;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public Date getDateF() {
        return dateF;
    }

    public void setDateF(Date dateF) {
        this.dateF = dateF;
    }


}
