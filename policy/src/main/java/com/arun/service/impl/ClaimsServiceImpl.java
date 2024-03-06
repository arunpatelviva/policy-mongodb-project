package com.arun.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arun.entity.Claims;
import com.arun.repository.ClaimsRepository;
import com.arun.service.ClaimsService;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClaimsServiceImpl implements ClaimsService {

	@Autowired ClaimsRepository claimsRepository;

	@Override
	public List<Claims> findAll() {
		return claimsRepository.findAll();
	}
	
	@Override
	public Claims findById(String id) throws Exception {
		return claimsRepository.findById(id).orElseThrow(() -> new Exception("Claim Not Found."));
	}

	@Override
	public List<Claims> findByClaimNumber(String claimNumber) {
		return claimsRepository.findByClaimNumber(claimNumber);
	}

	@Override
	public String save(Claims claims) {
		if(claims.getId() == null) 
			claims.setId(UUID.randomUUID().toString());
		return claimsRepository.save(claims).getId();
	}

	@Override
	public String update(String id, Claims request) throws Exception {
		Claims claims = findById(id);
		claims.setClaimNumber(request.getClaimNumber());
		claims.setDateOfDeath(request.getDateOfDeath());
		claims.setStatus(request.getStatus());
		claimsRepository.save(claims);
		return claims.getId();
	}

	@Override
	public Boolean deleteById(String id) {
		claimsRepository.deleteById(id);
		return Boolean.TRUE;
	}

	@Override
	public Boolean deleteAll() {
		claimsRepository.deleteAll();
		return Boolean.TRUE;
	}

}
