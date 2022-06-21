package com.yobitrust.HachCovid19Back.Repositories;


import com.yobitrust.HachCovid19Back.Models.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PatientRepository  extends MongoRepository<Patient,String> {
    Patient findByDate(String date);

}
