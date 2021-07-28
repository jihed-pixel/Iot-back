package com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio;

import com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN.CLAIRCREAT;
import com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN.CREAT;
import com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN.UREE;
import com.yobitrust.HachCovid19Back.Models.PatientParts.NFS.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BilanRenal {
    private List<CREAT> creats;
    private List<CLAIRCREAT> clairCreats;
    private List<UREE> urees;




        public BilanRenal() {
            this.creats=new ArrayList<>();
            this.clairCreats=new ArrayList<>();
            this.urees=new ArrayList<>();
        }

    public BilanRenal(List<CREAT> creats, List<CLAIRCREAT> clairCreats, List<UREE> urees) {
        this.creats = creats;
        this.clairCreats = clairCreats;
        this.urees = urees;
    }

    public List<CREAT> getCreats() {
        return creats;
    }

    public void setCreats(List<CREAT> creats) {
        this.creats = creats;
    }

    public List<CLAIRCREAT> getClairCreats() {
        return clairCreats;
    }

    public void setClairCreats(List<CLAIRCREAT> clairCreats) {
        this.clairCreats = clairCreats;
    }

    public List<UREE> getUrees() {
        return urees;
    }

    public void setUrees(List<UREE> urees) {
        this.urees = urees;
    }
}

