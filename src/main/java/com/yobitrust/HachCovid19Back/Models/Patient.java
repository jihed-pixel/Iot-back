package com.yobitrust.HachCovid19Back.Models;

import com.yobitrust.HachCovid19Back.Models.PatientParts.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.AntecedentsMedicaux.AntecedentMedicaux;
import com.yobitrust.HachCovid19Back.Models.PatientParts.ExpoRisque.ExpoRisque;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Document
public class Patient {
    @Id
    private Integer cin ;
    private Integer matricule ;
    private GeneralInformation generalInformation;
    private HabitudesDeVie habitudesDeVie;
    private ExpoRisque expoRisque;
    private HashMap<String, AntecedentMedicaux> antecedentMedicaux;
    private List<ConfDiag> confDiags;
    private List<Admission> admissions;
    private CaracCliniques caracCliniques;
    private ExamenCli examenCli;
    private ExamRadio_ParaCli examRadio_paraCli;
    private EvaluationFinale evaluationFinale;
    private ExamBio examBio;
    private Traitement traitement;
    private EvoluationQuo evolution;
    //private List<ConfDiag> confDiags;

    public Patient() {
       // this.generalInformation=new GeneralInformation();
        this.antecedentMedicaux=new HashMap<String, AntecedentMedicaux>();
        this.confDiags= new ArrayList<>();
        this.admissions=new ArrayList<>();
        this.examRadio_paraCli=new ExamRadio_ParaCli();
        this.caracCliniques= new CaracCliniques();
        this.examBio= new ExamBio();
        this.traitement= new Traitement();
        this.evolution=new EvoluationQuo();
        //this.confDiags= new ArrayList<>();
    }

    public Patient(ExpoRisque expoRisque,List<Admission> admissions,CaracCliniques caracCliniques,ExamenCli examenCli,ExamRadio_ParaCli examRadio_paraCli,EvaluationFinale evaluationFinale,ExamBio examBio,Traitement traitement,EvoluationQuo evolution,Integer cin ,List<ConfDiag> confDiags, Integer matricule,GeneralInformation generalInformation,HabitudesDeVie habitudesDeVie,HashMap<String,AntecedentMedicaux>  antecedentMedicaux) {
        this.cin = cin;
        this.matricule = matricule;
        this.generalInformation=generalInformation;
        this.habitudesDeVie=habitudesDeVie;
        this.antecedentMedicaux=antecedentMedicaux;
        this.expoRisque = expoRisque;
        this.confDiags=confDiags;
        this.admissions=admissions;
        this.caracCliniques=caracCliniques;
        this.examenCli=examenCli;
        this.examRadio_paraCli=examRadio_paraCli;
        this.evaluationFinale=evaluationFinale;
        this.examBio=examBio;
        this.traitement=traitement;
        this.evolution=evolution;
        //this.confDiags=confDiags;
    }
    public List<ConfDiag> getConfDiags() {
        return confDiags;
    }

    public void setConfDiags(List<ConfDiag> confDiags) {
        this.confDiags = confDiags;
    }
  /*  public List<ConfDiag> getConfDiags() {
        return confDiags;
    }

    public void setConfDiags(List<ConfDiag> confDiags) {
        this.confDiags = confDiags;
    }
*/

    public HashMap<String, AntecedentMedicaux> getAntecedentMedicaux() {
        return antecedentMedicaux;
    }

    public void setAntecedentMedicaux(HashMap<String, AntecedentMedicaux> antecedentMedicaux) {
        this.antecedentMedicaux = antecedentMedicaux; }

    public ExpoRisque getExpoRisque() {
        return expoRisque;
    }

    public void setExpoRisque(ExpoRisque expoRisque) {
        this.expoRisque = expoRisque;
    }

    public Integer getCin() {
        return cin;
    }

    public void setCin(Integer cin) {
        this.cin = cin;
    }

    public Integer getMatricule() {
        return matricule;
    }

    public void setMatricule(Integer matricule) {
        this.matricule = matricule;
    }

    public GeneralInformation getGeneralInformation() {
        return generalInformation;
    }

    public void setGeneralInformation(GeneralInformation generalInformation) {
        this.generalInformation = generalInformation; }

    public HabitudesDeVie getHabitudesDeVie() {
        return habitudesDeVie;
    }

    public void setHabitudesDeVie(HabitudesDeVie habitudesDeVie) {
        this.habitudesDeVie = habitudesDeVie;
    }

    public ExamBio getExamBio() {
        return examBio;
    }

    public void setExamBio(ExamBio examBio) {
        this.examBio = examBio;
    }

    public CaracCliniques getCaracCliniques() {
        return caracCliniques;
    }

    public void setCaracCliniques(CaracCliniques caracCliniques) {
        this.caracCliniques = caracCliniques;
    }

    public List<Admission> getAdmissions() {
        return admissions;
    }

    public void setAdmissions(List<Admission> admissions) {
        this.admissions = admissions;
    }


    public ExamenCli getExamenCli() {
        return examenCli;
    }

    public void setExamenCli(ExamenCli examenCli) {
        this.examenCli = examenCli;
    }



    public EvaluationFinale getEvaluationFinale() {
        return evaluationFinale;
    }

    public void setEvaluationFinale(EvaluationFinale evaluationFinale) {
        this.evaluationFinale = evaluationFinale;
    }

    public ExamRadio_ParaCli getExamRadio_paraCli() {
        return examRadio_paraCli;
    }

    public void setExamRadio_paraCli(ExamRadio_ParaCli examRadio_paraCli) {
        this.examRadio_paraCli = examRadio_paraCli;
    }

    public Traitement getTraitement() {
        return traitement;
    }

    public void setTraitement(Traitement traitement) {
        this.traitement = traitement;
    }

    public EvoluationQuo getEvolution() {
        return evolution;
    }

    public void setEvolution(EvoluationQuo evolution) {
        this.evolution = evolution;
    }


}
