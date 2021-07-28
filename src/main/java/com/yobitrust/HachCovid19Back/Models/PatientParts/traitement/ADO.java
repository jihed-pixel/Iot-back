package com.yobitrust.HachCovid19Back.Models.PatientParts.traitement;
import com.yobitrust.HachCovid19Back.Models.PatientParts.Traitement;
import java.util.Date;

public class ADO extends TraitementPart{
    private String dosage;


    public ADO(String dosage, Date dateD, Date dateF) {
        super(dateD,dateF);
        this.dosage=dosage;
    }

    public ADO() {
        super();
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
