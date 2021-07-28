package com.yobitrust.HachCovid19Back.Models.RequestModels;


import java.util.Date;

public class AddPatient {
    private Integer cin;
    private Integer matricule;
    private String identifiant;
    private String nom;
    private String prenom;
    private String sexe;
    private Date birthDate;
    private String nationnalite;
    private String adresse;
    private String telPort;
    private String telDomicile;
    private String profession;
    private String niveauEtude;
    private Boolean vitSeul;
    private Integer individu;
    private Integer enfant;
    private Integer chambres;

    public AddPatient() {
    }

    public AddPatient(Integer cin, Integer matricule, String identifiant,String nom, String prenom, String sexe, Date birthDate, String nationnalite, String adresse, String telPort, String telDomicile, String profession, String niveauEtude, Boolean vitSeul, Integer individu, Integer enfant, Integer chambres) {
        this.cin = cin;
        this.matricule = matricule;
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.birthDate = birthDate;
        this.nationnalite = nationnalite;
        this.adresse = adresse;
        this.telPort = telPort;
        this.telDomicile = telDomicile;
        this.profession = profession;
        this.niveauEtude = niveauEtude;
        this.vitSeul = vitSeul;
        this.individu = individu;
        this.enfant = enfant;
        this.chambres = chambres;
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

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationnalite() {
        return nationnalite;
    }

    public void setNationnalite(String nationnalite) {
        this.nationnalite = nationnalite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public String getTelPort() {
        return telPort;
    }

    public void setTelPort(String telPort) {
        this.telPort = telPort;
    }

    public String getTelDomicile() {
        return telDomicile;
    }

    public void setTelDomicile(String telDomicile) {
        this.telDomicile = telDomicile;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getNiveauEtude() {
        return niveauEtude;
    }

    public void setNiveauEtude(String niveauEtude) {
        this.niveauEtude = niveauEtude;
    }

    public Boolean getVitSeul() {
        return vitSeul;
    }

    public void setVitSeul(Boolean vitSeul) {
        this.vitSeul = vitSeul;
    }

    public Integer getIndividu() {
        return individu;
    }

    public void setIndividu(Integer individu) {
        this.individu = individu;
    }

    public Integer getEnfant() {
        return enfant;
    }

    public void setEnfant(Integer enfant) {
        this.enfant = enfant;
    }

    public Integer getChambres() {
        return chambres;
    }

    public void setChambres(Integer chambres) {
        this.chambres = chambres;
    }
}
