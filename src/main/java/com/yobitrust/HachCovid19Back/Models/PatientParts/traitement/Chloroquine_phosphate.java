package com.yobitrust.HachCovid19Back.Models.PatientParts.traitement;

import java.util.Date;

public class Chloroquine_phosphate extends TraitementPart{
    private String dosage;


    public Chloroquine_phosphate(String dosage, Date dateD, Date dateF) {
        super(dateD,dateF);
        this.dosage=dosage;
    }

    public Chloroquine_phosphate() {
        super();
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
