package com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio;

import com.yobitrust.HachCovid19Back.Models.PatientParts.NFS.*;

import java.util.ArrayList;
import java.util.List;

public class Nfs {
    private List<GB> gbs;
    private List<LYM> lyms;
    private List<PLA> plas;
    private List<HB> hbs;
    private List<HT> hts;
    public Nfs() {
        this.gbs=new ArrayList<>();
        this.lyms=new ArrayList<>();
        this.plas=new ArrayList<>();
        this.hbs=new ArrayList<>();
        this.hts=new ArrayList<>();

    }

    public Nfs(List<GB> gbs, List<LYM> lyms, List<PLA> plas, List<HB> hbs, List<HT> hts) {
        this.gbs = gbs;
        this.lyms = lyms;
        this.plas = plas;
        this.hbs = hbs;
        this.hts = hts;
    }

    public List<GB> getGbs() {
        return gbs;
    }

    public void setGbs(List<GB> gbs) {
        this.gbs = gbs;
    }

    public List<LYM> getLyms() {
        return lyms;
    }

    public void setLyms(List<LYM> lyms) {
        this.lyms = lyms;
    }

    public List<PLA> getPlas() {
        return plas;
    }

    public void setPlas(List<PLA> plas) {
        this.plas = plas;
    }

    public List<HB> getHbs() {
        return hbs;
    }

    public void setHbs(List<HB> hbs) {
        this.hbs = hbs;
    }

    public List<HT> getHts() {
        return hts;
    }

    public void setHts(List<HT> hts) {
        this.hts = hts;
    }
}
