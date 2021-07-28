package com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio;

import com.yobitrust.HachCovid19Back.Models.PatientParts.NFS.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.gdsa.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GDSA {
    private List<PH> phs;
    private List<PAO2> pao2s;
    private List<PACO2> paco2s;
    private List<HCO3> hco3s;
    private List<SAO2> sao2s;

    public GDSA() {
    }

    public GDSA(List<PH> phs, List<PAO2> pao2s, List<PACO2> paco2s, List<HCO3> hco3s, List<SAO2> sao2s) {
        this.phs = phs;
        this.pao2s = pao2s;
        this.paco2s = paco2s;
        this.hco3s = hco3s;
        this.sao2s = sao2s;
    }

    public List<PH> getPhs() {
        return phs;
    }

    public void setPhs(List<PH> phs) {
        this.phs = phs;
    }

    public List<PAO2> getPao2s() {
        return pao2s;
    }

    public void setPao2s(List<PAO2> pao2s) {
        this.pao2s = pao2s;
    }

    public List<PACO2> getPaco2s() {
        return paco2s;
    }

    public void setPaco2s(List<PACO2> paco2s) {
        this.paco2s = paco2s;
    }

    public List<HCO3> getHco3s() {
        return hco3s;
    }

    public void setHco3s(List<HCO3> hco3s) {
        this.hco3s = hco3s;
    }

    public List<SAO2> getSao2s() {
        return sao2s;
    }

    public void setSao2s(List<SAO2> sao2s) {
        this.sao2s = sao2s;
    }
}

