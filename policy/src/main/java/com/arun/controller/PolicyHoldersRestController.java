package com.arun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arun.entity.PolicyHolders;
import com.arun.service.PolicyHoldersService;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@RestController
@RequestMapping(value =  "/policyHolders", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PolicyHoldersRestController {

	@Autowired PolicyHoldersService policyHoldersService;
	
	@GetMapping
	public ResponseEntity<Object> findAll() {
		return ResponseEntity.ok(policyHoldersService.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findById(@PathVariable String id) throws Exception {
		return ResponseEntity.ok(policyHoldersService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Object> save(@RequestBody PolicyHolders policyHolders) {
		return ResponseEntity.ok(policyHoldersService.save(policyHolders));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable String id, @RequestBody PolicyHolders request) throws Exception {
		return ResponseEntity.ok(policyHoldersService.update(id, request));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable String id) {
		return ResponseEntity.ok(policyHoldersService.deleteById(id));
	}

	@DeleteMapping("/deleteAll")
	public ResponseEntity<Object> deleteAll() {
		return ResponseEntity.ok(policyHoldersService.deleteAll());
	}
	
}
