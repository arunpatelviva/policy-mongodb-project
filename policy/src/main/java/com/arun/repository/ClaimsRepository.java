package com.arun.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.arun.entity.Claims;

@Repository
public interface ClaimsRepository extends MongoRepository<Claims, String>{

	List<Claims> findByClaimNumber(String claimNumber);

}
