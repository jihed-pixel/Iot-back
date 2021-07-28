package com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio;

import com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.NFS.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BilanHepa {
    private List<BILIRU> bilirus;
    private List<BILIRU1> biliru1s;
    private List<ALAT> alats;
    private List<ASAT> asats;
    private List<TP> tps;
    private List<FACTEURV> facteurVs;
    private List<FIBRINOGENE> fibrinogenes;
    private List<CPK_MB> cpk_mbs;
    private List<TROPONINE> troponines ;
    private List<PRO_BNP> pro_bnps;
    private List<ALBUMI> albumis;
    private List<D_DIMERE> d_dimères;
    private List<LDH> ldhs;
    private List<CRP> crps;
    private List<PROCAL> procals;
    private List<FERRI> ferris;

        public BilanHepa() {
            this.bilirus=new ArrayList<>();
            this.biliru1s=new ArrayList<>();
            this.alats=new ArrayList<>();
            this.asats=new ArrayList<>();
            this.tps=new ArrayList<>();
            this.facteurVs=new ArrayList<>();
            this.fibrinogenes=new ArrayList<>();
            this.cpk_mbs=new ArrayList<>();
            this.troponines=new ArrayList<>();
            this.pro_bnps=new ArrayList<>();
            this.albumis=new ArrayList<>();
            this.d_dimères=new ArrayList<>();
            this.ldhs=new ArrayList<>();
            this.crps=new ArrayList<>();
            this.procals=new ArrayList<>();
            this.ferris=new ArrayList<>();

        }

    public BilanHepa(List<BILIRU> bilirus, List<BILIRU1> biliru1s, List<ALAT> alats, List<ASAT> asats, List<TP> tps, List<FACTEURV> facteurVs, List<FIBRINOGENE> fibrinogenes, List<CPK_MB> cpk_mbs, List<TROPONINE> troponines, List<PRO_BNP> pro_bnps, List<ALBUMI> albumis, List<D_DIMERE> d_dimères, List<LDH> ldhs, List<CRP> crps, List<PROCAL> procals, List<FERRI> ferris) {
        this.bilirus = bilirus;
        this.biliru1s = biliru1s;
        this.alats = alats;
        this.asats = asats;
        this.tps = tps;
        this.facteurVs = facteurVs;
        this.fibrinogenes = fibrinogenes;
        this.cpk_mbs = cpk_mbs;
        this.troponines = troponines;
        this.pro_bnps = pro_bnps;
        this.albumis = albumis;
        this.d_dimères = d_dimères;
        this.ldhs = ldhs;
        this.crps = crps;
        this.procals = procals;
        this.ferris = ferris;
    }

    public List<BILIRU> getBilirus() {
        return bilirus;
    }

    public void setBilirus(List<BILIRU> bilirus) {
        this.bilirus = bilirus;
    }

    public List<BILIRU1> getBiliru1s() {
        return biliru1s;
    }

    public void setBiliru1s(List<BILIRU1> biliru1s) {
        this.biliru1s = biliru1s;
    }

    public List<ALAT> getAlats() {
        return alats;
    }

    public void setAlats(List<ALAT> alats) {
        this.alats = alats;
    }

    public List<ASAT> getAsats() {
        return asats;
    }

    public void setAsats(List<ASAT> asats) {
        this.asats = asats;
    }

    public List<TP> getTps() {
        return tps;
    }

    public void setTps(List<TP> tps) {
        this.tps = tps;
    }

    public List<FACTEURV> getFacteurVs() {
        return facteurVs;
    }

    public void setFacteurVs(List<FACTEURV> facteurVs) {
        this.facteurVs = facteurVs;
    }

    public List<FIBRINOGENE> getFibrinogenes() {
        return fibrinogenes;
    }

    public void setFibrinogenes(List<FIBRINOGENE> fibrinogenes) {
        this.fibrinogenes = fibrinogenes;
    }

    public List<CPK_MB> getCpk_mbs() {
        return cpk_mbs;
    }

    public void setCpk_mbs(List<CPK_MB> cpk_mbs) {
        this.cpk_mbs = cpk_mbs;
    }

    public List<TROPONINE> getTroponines() {
        return troponines;
    }

    public void setTroponines(List<TROPONINE> troponines) {
        this.troponines = troponines;
    }

    public List<PRO_BNP> getPro_bnps() {
        return pro_bnps;
    }

    public void setPro_bnps(List<PRO_BNP> pro_bnps) {
        this.pro_bnps = pro_bnps;
    }

    public List<ALBUMI> getAlbumis() {
        return albumis;
    }

    public void setAlbumis(List<ALBUMI> albumis) {
        this.albumis = albumis;
    }

    public List<D_DIMERE> getD_dimères() {
        return d_dimères;
    }

    public void setD_dimères(List<D_DIMERE> d_dimères) {
        this.d_dimères = d_dimères;
    }

    public List<LDH> getLdhs() {
        return ldhs;
    }

    public void setLdhs(List<LDH> ldhs) {
        this.ldhs = ldhs;
    }

    public List<CRP> getCrps() {
        return crps;
    }

    public void setCrps(List<CRP> crps) {
        this.crps = crps;
    }

    public List<PROCAL> getProcals() {
        return procals;
    }

    public void setProcals(List<PROCAL> procals) {
        this.procals = procals;
    }

    public List<FERRI> getFerris() {
        return ferris;
    }

    public void setFerris(List<FERRI> ferris) {
        this.ferris = ferris;
    }
}

