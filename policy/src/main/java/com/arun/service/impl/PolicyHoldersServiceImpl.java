package com.arun.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arun.entity.PolicyHolders;
import com.arun.repository.PolicyHoldersRepository;
import com.arun.service.PolicyHoldersService;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PolicyHoldersServiceImpl implements PolicyHoldersService {

	@Autowired PolicyHoldersRepository policyHoldersRepository;

	@Override
	public List<PolicyHolders> findAll() {
		return policyHoldersRepository.findAll();
	}
	
	@Override
	public PolicyHolders findById(String id) throws Exception {
		return policyHoldersRepository.findById(id).orElseThrow(() -> new Exception("Policy Holders Not Found."));
	}

	@Override
	public String save(PolicyHolders policyHolders) {
		if(policyHolders.getId() == null) 
			policyHolders.setId(UUID.randomUUID().toString());
		return policyHoldersRepository.save(policyHolders).getId();
	}

	@Override
	public String update(String id, PolicyHolders request) throws Exception {
		PolicyHolders policyHolders = findById(id);
		policyHolders.setPhoneNumber(request.getPhoneNumber());
		policyHolders.setState(request.getState());
		policyHolders.setStatus(request.getStatus());
		policyHolders.setEmail(request.getEmail());
		policyHoldersRepository.save(policyHolders);
		return policyHolders.getId();
	}

	@Override
	public Boolean deleteById(String id) {
		policyHoldersRepository.deleteById(id);
		return Boolean.TRUE;
	}

	@Override
	public Boolean deleteAll() {
		policyHoldersRepository.deleteAll();
		return Boolean.TRUE;
	}

}
