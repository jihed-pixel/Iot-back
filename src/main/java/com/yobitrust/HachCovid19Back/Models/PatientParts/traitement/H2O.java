package com.yobitrust.HachCovid19Back.Models.PatientParts.traitement;

import java.util.Date;

public class H2O extends TraitementPart{
    private String dosage;


    public H2O(String dosage, Date dateD, Date dateF) {
        super(dateD,dateF);
        this.dosage=dosage;
    }

    public H2O() {
        super();
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
