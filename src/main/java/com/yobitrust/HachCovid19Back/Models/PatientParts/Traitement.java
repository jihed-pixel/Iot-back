package com.yobitrust.HachCovid19Back.Models.PatientParts;

import com.yobitrust.HachCovid19Back.Models.PatientParts.CaracteristiquesCliniques.Symptome;
import com.yobitrust.HachCovid19Back.Models.PatientParts.traitement.TraitementPart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Traitement {
    private Boolean trait;
    private String pactt;
    private HashMap<String,TraitementPart>traitementPart;

    public Traitement() {
        this.traitementPart=new HashMap<String, TraitementPart>();
    }

    public Traitement(String pactt, HashMap<String, TraitementPart> traitementPart) {
        this.trait = trait ;
        this.pactt = pactt;
        this.traitementPart = traitementPart;
    }
    public Boolean getTrait() {
        return trait;
    }

    public void setTrait(Boolean trait) {
        this.trait = trait;
        if(trait ==false){
            this.setTraitementPart(new HashMap<String,TraitementPart>());
        }
    }
    public String getPactt() {
        return pactt;
    }

    public void setPactt(String pactt) {
        this.pactt = pactt;
    }

    public HashMap<String, TraitementPart> getTraitementPart() {
        return traitementPart;
    }

    public void setTraitementPart(HashMap<String, TraitementPart> traitementPart) {
        this.traitementPart = traitementPart;
    }
}