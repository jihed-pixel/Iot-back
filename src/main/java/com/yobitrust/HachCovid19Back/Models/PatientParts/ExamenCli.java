package com.yobitrust.HachCovid19Back.Models.PatientParts;


import java.util.HashMap;

public class ExamenCli {
    private Double temperature;
    private Double fr;
    private Double fc;
    private Double sao2;
    private Double pa_sys;//pression arterielle sysytolique
    private Double pa_dya;//pression arterielle dyastolique
    private Double scoreGlas;
    private Double scoreGlas1;
    private Double poids;
    private Integer taille; //la taille est en cm
    private String examOro;
    private String examPulmo;
    private String examOphta;
    private String examCut;
    private String examNeuro;
    private String examCardio;
    private String autre;

    public ExamenCli() {
    }

    public ExamenCli(Double temperature, Double fr, Double fc, Double sao2, Double pa_sys, Double pa_dya, Double scoreGlas, Double scoreGlas1, Double poids, Integer taille, String examOro, String examPulmo, String examOphta, String examCut, String examNeuro, String examCardio, String autre) {
        this.temperature = temperature;
        this.fr = fr;
        this.fc = fc;
        this.sao2 = sao2;
        this.pa_sys = pa_sys;
        this.pa_dya = pa_dya;
        this.scoreGlas = scoreGlas;
        this.scoreGlas1 = scoreGlas1;
        this.poids = poids;
        this.taille = taille;
        this.examOro = examOro;
        this.examPulmo = examPulmo;
        this.examOphta = examOphta;
        this.examCut = examCut;
        this.examNeuro = examNeuro;
        this.examCardio = examCardio;
        this.autre = autre;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getFr() {
        return fr;
    }

    public void setFr(Double fr) {
        this.fr = fr;
    }

    public Double getFc() {
        return fc;
    }

    public void setFc(Double fc) {
        this.fc = fc;
    }

    public Double getSao2() {
        return sao2;
    }

    public void setSao2(Double sao2) {
        this.sao2 = sao2;
    }

    public Double getPa_sys() {
        return pa_sys;
    }

    public void setPa_sys(Double pa_sys) {
        this.pa_sys = pa_sys;
    }

    public Double getPa_dya() {
        return pa_dya;
    }

    public void setPa_dya(Double pa_dya) {
        this.pa_dya = pa_dya;
    }

    public Double getScoreGlas() {
        return scoreGlas;
    }

    public void setScoreGlas(Double scoreGlas) {
        this.scoreGlas = scoreGlas;
    }

    public Double getScoreGlas1() {
        return scoreGlas1;
    }

    public void setScoreGlas1(Double scoreGlas1) {
        this.scoreGlas1 = scoreGlas1;
    }

    public Double getPoids() {
        return poids;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }

    public Integer getTaille() {
        return taille;
    }

    public void setTaille(Integer taille) {
        this.taille = taille;
    }

    public String getExamOro() {
        return examOro;
    }

    public void setExamOro(String examOro) {
        this.examOro = examOro;
    }

    public String getExamPulmo() {
        return examPulmo;
    }

    public void setExamPulmo(String examPulmo) {
        this.examPulmo = examPulmo;
    }

    public String getExamOphta() {
        return examOphta;
    }

    public void setExamOphta(String examOphta) {
        this.examOphta = examOphta;
    }

    public String getExamCut() {
        return examCut;
    }

    public void setExamCut(String examCut) {
        this.examCut = examCut;
    }

    public String getExamNeuro() {
        return examNeuro;
    }

    public void setExamNeuro(String examNeuro) {
        this.examNeuro = examNeuro;
    }

    public String getExamCardio() {
        return examCardio;
    }

    public void setExamCardio(String examCardio) {
        this.examCardio = examCardio;
    }

    public String getAutre() {
        return autre;
    }

    public void setAutre(String autre) {
        this.autre = autre;
    }
}
