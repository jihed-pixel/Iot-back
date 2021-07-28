package com.yobitrust.HachCovid19Back.Models.PatientParts;

import com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio.*;

public class ExamBio {
    private Nfs nfs;
    private BilanRenal bilanRenal;
    private BilanHepa bilanHepa;
    private GDSA gdsas;
    private Ionogra ionogras;
    private AutreBilan autreBilans;
    public ExamBio() {
        // this.generalInformation=new GeneralInformation();
        this.nfs= new Nfs();
        this.bilanRenal=new BilanRenal();
        this.bilanHepa=new BilanHepa();
        this.gdsas= new GDSA();
        this.ionogras=new Ionogra();
        this.autreBilans=new AutreBilan();
    }
    public ExamBio(Nfs nfs, BilanRenal bilanRenal, BilanHepa bilanHepa, GDSA gdsas, Ionogra ionogras, AutreBilan autreBilans) {
        this.nfs = nfs;
        this.bilanRenal = bilanRenal;
        this.bilanHepa = bilanHepa;
        this.gdsas = gdsas;
        this.ionogras = ionogras;
        this.autreBilans = autreBilans;
    }

    public Nfs getNfs() {
        return nfs;
    }

    public void setNfs(Nfs nfs) {
        this.nfs = nfs;
    }

    public BilanRenal getBilanRenal() {
        return bilanRenal;
    }

    public void setBilanRenal(BilanRenal bilanRenal) {
        this.bilanRenal = bilanRenal;
    }

    public BilanHepa getBilanHepa() {
        return bilanHepa;
    }

    public void setBilanHepa(BilanHepa bilanHepa) {
        this.bilanHepa = bilanHepa;
    }

    public GDSA getGdsas() {
        return gdsas;
    }

    public void setGdsas(GDSA gdsas) {
        this.gdsas = gdsas;
    }

    public Ionogra getIonogras() {
        return ionogras;
    }

    public void setIonogras(Ionogra ionogras) {
        this.ionogras = ionogras;
    }

    public AutreBilan getAutreBilans() {
        return autreBilans;
    }

    public void setAutreBilans(AutreBilan autreBilans) {
        this.autreBilans = autreBilans;
    }
}
