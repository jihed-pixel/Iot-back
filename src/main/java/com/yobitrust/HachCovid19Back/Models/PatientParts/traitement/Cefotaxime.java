package com.yobitrust.HachCovid19Back.Models.PatientParts.traitement;

import java.util.Date;

public class Cefotaxime extends TraitementPart{
    private String dosage;


    public Cefotaxime(String dosage, Date dateD, Date dateF) {
        super(dateD,dateF);
        this.dosage=dosage;
    }

    public Cefotaxime() {
        super();
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
