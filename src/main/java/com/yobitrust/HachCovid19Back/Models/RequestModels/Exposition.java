package com.yobitrust.HachCovid19Back.Models.RequestModels;

import java.util.Date;

public class Exposition {
    //private String nomExpo;
    private Date dateEnt;
    private String lieuEnt;
    private String moyensTran;
    private String autre;
    private String details;
    private String contact;
    private Integer idTun;
    private Date dateDebutC;
    private Date dateFinC ;
    private  String nom;
    private String moyenTranQu;
    private Date date;
    private  boolean respect;
    private Date dateD;
    private Date dateF;
    private Boolean habite;
    private String villes;
    private String villesPar;
    private Date dateV1;
    private String moyenTranV1;
    private Date dateV2;
    private String moyenTranV2;
    private Date dateDQu;
    private Date dateFDQu;


    public Exposition() {
    }

    public Exposition( Date dateEnt, String lieuEnt, String moyensTran, String autre, String details, String contact, Integer idTun, Date dateDebutC, Date dateFinC, String nom, String moyenTranQu, Date date, boolean respect, Date dateD, Date dateF, Boolean habite, String villes, String villesPar, Date dateV1, String moyenTranV1, Date dateV2, String moyenTranV2, Date dateDQu, Date dateFDQu) {

        this.dateEnt = dateEnt;
        this.lieuEnt = lieuEnt;
        this.moyensTran = moyensTran;
        this.autre = autre;
        this.details = details;
        this.contact = contact;
        this.idTun = idTun;
        this.dateDebutC = dateDebutC;
        this.dateFinC = dateFinC;
        this.nom = nom;
        this.moyenTranQu = moyenTranQu;
        this.date = date;
        this.respect = respect;
        this.dateD = dateD;
        this.dateF = dateF;
        this.habite = habite;
        this.villes = villes;
        this.villesPar = villesPar;
        this.dateV1 = dateV1;
        this.moyenTranV1 = moyenTranV1;
        this.dateV2 = dateV2;
        this.moyenTranV2 = moyenTranV2;
        this.dateDQu = dateDQu;
        this.dateFDQu = dateFDQu;
    }
/*
    public String getNomExpo() {
        return nomExpo;
    }

    public void setNomExpo(String nomExpo) {
        this.nomExpo = nomExpo;
    }

 */

    public Date getDateEnt() {
        return dateEnt;
    }

    public void setDateEnt(Date dateEnt) {
        this.dateEnt = dateEnt;
    }

    public String getLieuEnt() {
        return lieuEnt;
    }

    public void setLieuEnt(String lieuEnt) {
        this.lieuEnt = lieuEnt;
    }

    public String getMoyensTran() {
        return moyensTran;
    }

    public void setMoyensTran(String moyensTran) {
        this.moyensTran = moyensTran;
    }

    public String getAutre() {
        return autre;
    }

    public void setAutre(String autre) {
        this.autre = autre;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getIdTun() {
        return idTun;
    }

    public void setIdTun(Integer idTun) {
        this.idTun = idTun;
    }

    public Date getDateDebutC() {
        return dateDebutC;
    }

    public void setDateDebutC(Date dateDebutC) {
        this.dateDebutC = dateDebutC;
    }

    public Date getDateFinC() {
        return dateFinC;
    }

    public void setDateFinC(Date dateFinC) {
        this.dateFinC = dateFinC;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMoyenTranQu() {
        return moyenTranQu;
    }

    public void setMoyenTranQu(String moyenTranQu) {
        this.moyenTranQu = moyenTranQu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isRespect() {
        return respect;
    }

    public void setRespect(boolean respect) {
        this.respect = respect;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public Date getDateF() {
        return dateF;
    }

    public void setDateF(Date dateF) {
        this.dateF = dateF;
    }

    public Boolean getHabite() {
        return habite;
    }

    public void setHabite(Boolean habite) {
        this.habite = habite;
    }

    public String getVilles() {
        return villes;
    }

    public void setVilles(String villes) {
        this.villes = villes;
    }

    public String getVillesPar() {
        return villesPar;
    }

    public void setVillesPar(String villesPar) {
        this.villesPar = villesPar;
    }

    public Date getDateV1() {
        return dateV1;
    }

    public void setDateV1(Date dateV1) {
        this.dateV1 = dateV1;
    }

    public String getMoyenTranV1() {
        return moyenTranV1;
    }

    public void setMoyenTranV1(String moyenTranV1) {
        this.moyenTranV1 = moyenTranV1;
    }

    public Date getDateV2() {
        return dateV2;
    }

    public void setDateV2(Date dateV2) {
        this.dateV2 = dateV2;
    }

    public String getMoyenTranV2() {
        return moyenTranV2;
    }

    public void setMoyenTranV2(String moyenTranV2) {
        this.moyenTranV2 = moyenTranV2;
    }

    public Date getDateDQu() {
        return dateDQu;
    }

    public void setDateDQu(Date dateDQu) {
        this.dateDQu = dateDQu;
    }

    public Date getDateFDQu() {
        return dateFDQu;
    }

    public void setDateFDQu(Date dateFDQu) {
        this.dateFDQu = dateFDQu;
    }
}
