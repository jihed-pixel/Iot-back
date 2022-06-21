package com.yobitrust.HachCovid19Back.Repositories;


import com.yobitrust.HachCovid19Back.Models.AddDate;
import com.yobitrust.HachCovid19Back.Models.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DateRepository extends MongoRepository<AddDate,Long> {
    AddDate findByDate(String date);

}
