package com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio;
import com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA.NAK1;
import com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA.NAKUR;
import com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA.NAKUR1;
import com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA.NAk;

import java.util.ArrayList;
import java.util.List;

public class Ionogra {
    private List<NAk> naks;
    private List<NAK1> nak1s;
    private List<NAKUR> nakUrs;
    private List<NAKUR1> nakUr1s;
    public Ionogra() {
        this.naks=new ArrayList<>();
        this.nak1s=new ArrayList<>();
        this.nakUrs=new ArrayList<>();
        this.nakUr1s=new ArrayList<>();
    }

    public Ionogra(List<NAk> naks, List<NAK1> nak1s, List<NAKUR> nakUrs, List<NAKUR1> nakUr1s) {
        this.naks = naks;
        this.nak1s = nak1s;
        this.nakUrs = nakUrs;
        this.nakUr1s = nakUr1s;
    }

    public List<NAk> getNaks() {
        return naks;
    }

    public void setNaks(List<NAk> naks) {
        this.naks = naks;
    }

    public List<NAK1> getNak1s() {
        return nak1s;
    }

    public void setNak1s(List<NAK1> nak1s) {
        this.nak1s = nak1s;
    }

    public List<NAKUR> getNakUrs() {
        return nakUrs;
    }

    public void setNakUrs(List<NAKUR> nakUrs) {
        this.nakUrs = nakUrs;
    }

    public List<NAKUR1> getNakUr1s() {
        return nakUr1s;
    }

    public void setNakUr1s(List<NAKUR1> nakUr1s) {
        this.nakUr1s = nakUr1s;
    }
}
