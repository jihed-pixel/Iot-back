package com.yobitrust.HachCovid19Back.Models.RequestModels;

import java.util.Date;

public class GetEvolutionModel {
    private String category;
    private String type;

    public GetEvolutionModel() {
    }

    public GetEvolutionModel(String category, String type) {
        this.category = category;
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
