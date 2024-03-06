package com.arun.service;

import java.util.List;

import com.arun.entity.Claims;

public interface ClaimsService {

	List<Claims> findAll();

	Claims findById(String id) throws Exception;

	List<Claims> findByClaimNumber(String claimNumber);
	
	String save(Claims claims);

	String update(String id, Claims request) throws Exception;

	Boolean deleteById(String id);
	
	Boolean deleteAll();
	
}
