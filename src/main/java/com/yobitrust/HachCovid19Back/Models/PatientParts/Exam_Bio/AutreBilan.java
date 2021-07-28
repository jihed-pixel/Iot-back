package com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio;

import com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN.PATHS;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AutreBilan {
    private List<PATHS> pathss;

    public AutreBilan() {
        this.pathss=new ArrayList<>();
    }

    public AutreBilan(List<PATHS> pathss) {
        this.pathss = pathss;
    }

    public List<PATHS> getPathss() {
        return pathss;
    }

    public void setPathss(List<PATHS> pathss) {
        this.pathss = pathss;
    }
}
