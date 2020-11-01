package com.reyapr.mypracticeapp.dao;

import com.reyapr.mypracticeapp.entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
}