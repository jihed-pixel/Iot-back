package com.yobitrust.HachCovid19Back.Models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Document
public class AddDate {

    private String date ;
    public AddDate() {

    }

    public AddDate(String date) {
        this.date = date;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
