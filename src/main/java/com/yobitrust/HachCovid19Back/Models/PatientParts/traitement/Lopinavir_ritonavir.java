package com.yobitrust.HachCovid19Back.Models.PatientParts.traitement;

import java.util.Date;

public class Lopinavir_ritonavir extends TraitementPart{
    private String dosage;


    public Lopinavir_ritonavir(String dosage, Date dateD, Date dateF) {
        super(dateD,dateF);
        this.dosage=dosage;
    }

    public Lopinavir_ritonavir() {
        super();
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
