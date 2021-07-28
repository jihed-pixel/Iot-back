package com.yobitrust.HachCovid19Back.Models.RequestModels;

import java.util.Date;

public class GetTraitmentModel {
    private String trai;

    public GetTraitmentModel() {
    }

    public GetTraitmentModel( String trai) {
        this.trai = trai;
    }

    public String getTrai() {
        return trai;
    }

    public void setTrai(String trai) {
        this.trai = trai;
    }
}
