package com.arun.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.arun.entity.PolicyHolders;

@Repository
public interface PolicyHoldersRepository extends MongoRepository<PolicyHolders, String>{

}
