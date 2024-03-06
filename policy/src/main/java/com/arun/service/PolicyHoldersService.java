package com.arun.service;

import java.util.List;

import com.arun.entity.PolicyHolders;

public interface PolicyHoldersService {

	List<PolicyHolders> findAll();

	PolicyHolders findById(String id) throws Exception;

	String save(PolicyHolders policyHolders);

	String update(String id, PolicyHolders policyHolders) throws Exception;

	Boolean deleteById(String id);
	
	Boolean deleteAll();
	
}
