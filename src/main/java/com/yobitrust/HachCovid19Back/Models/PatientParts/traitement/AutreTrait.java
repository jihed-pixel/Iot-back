package com.yobitrust.HachCovid19Back.Models.PatientParts.traitement;

import java.util.Date;

public class AutreTrait extends TraitementPart{
    private String dosage;
    private String autre;



    public AutreTrait(String autre,String dosage, Date dateD, Date dateF) {
        super(dateD,dateF);
        this.dosage=dosage;
        this.autre=autre;
    }

    public AutreTrait() {
        super();
    }

    public String getAutre() {
        return autre;
    }

    public void setAutre(String autre) {
        this.autre = autre;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
