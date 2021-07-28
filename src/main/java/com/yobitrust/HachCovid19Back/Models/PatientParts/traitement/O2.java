package com.yobitrust.HachCovid19Back.Models.PatientParts.traitement;

import java.util.Date;

public class O2 extends TraitementPart{
    private String dosage;


    public O2(String dosage, Date dateD, Date dateF) {
        super(dateD,dateF);
        this.dosage=dosage;
    }

    public O2() {
        super();
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
