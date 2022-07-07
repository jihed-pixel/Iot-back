package com.yobitrust.HachCovid19Back.Repositories;


import com.yobitrust.HachCovid19Back.Models.Patientiot;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository  extends MongoRepository<Patientiot,String> {
    Patientiot findByDate(String date);

}
