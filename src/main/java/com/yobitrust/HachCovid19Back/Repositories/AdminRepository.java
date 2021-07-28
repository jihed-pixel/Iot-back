package com.yobitrust.HachCovid19Back.Repositories;

import com.yobitrust.HachCovid19Back.Models.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin,Long> {
    Admin findByUsernameAndPassword(String username,String password);
}

