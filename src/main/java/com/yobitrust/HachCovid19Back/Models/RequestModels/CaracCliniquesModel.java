package com.yobitrust.HachCovid19Back.Models.RequestModels;

import java.util.Date;

public class CaracCliniquesModel  {
    private Double temperature;
    private String type;
    private Integer selle;
    private Integer nbEpisodes;
    private String  autre;
    private Date dateD;
    private Date dateF;
    private Boolean sym;
    private String typeT;

    public CaracCliniquesModel() {
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSelle() {
        return selle;
    }

    public void setSelle(Integer selle) {
        this.selle = selle;
    }

    public Integer getNbEpisodes() {
        return nbEpisodes;
    }

    public void setNbEpisodes(Integer nbEpisodes) {
        this.nbEpisodes = nbEpisodes;
    }

    public String getAutre() {
        return autre;
    }

    public void setAutre(String autre) {
        this.autre = autre;
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

    public CaracCliniquesModel(Double temperature, String type, Integer selle, Integer nbEpisodes, String autre, Date dateD, Date dateF,Boolean sym, String typeT) {
        this.temperature = temperature;
        this.type = type;
        this.selle = selle;
        this.nbEpisodes = nbEpisodes;
        this.autre = autre;
        this.dateD = dateD;
        this.dateF = dateF;
        this.sym=sym;
        this.typeT=typeT;
    }

    public String getTypeT() {
        return typeT;
    }

    public void setTypeT(String typeT) {
        this.typeT = typeT;
    }

    public Boolean getSym() {
        return sym;
    }

    public void setSym(Boolean sym) {
        this.sym = sym;

    }
}
