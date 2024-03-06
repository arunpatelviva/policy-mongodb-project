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

import com.arun.entity.Claims;
import com.arun.service.ClaimsService;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@RestController
@RequestMapping(value =  "/claims", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClaimsRestController {

	@Autowired ClaimsService claimsService;
	
	@GetMapping
	public ResponseEntity<Object> findAll() {
		return ResponseEntity.ok(claimsService.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findById(@PathVariable String id) throws Exception {
		return ResponseEntity.ok(claimsService.findById(id));
	}

	@GetMapping("/findByClaimNumber/{claimNumber}")
	public ResponseEntity<Object> findByClaimNumber(@PathVariable String claimNumber) throws Exception {
		return ResponseEntity.ok(claimsService.findByClaimNumber(claimNumber));
	}

	
	@PostMapping
	public ResponseEntity<Object> save(@RequestBody Claims claims) {
		return ResponseEntity.ok(claimsService.save(claims));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable String id, @RequestBody Claims request) throws Exception {
		return ResponseEntity.ok(claimsService.update(id, request));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable String id) {
		return ResponseEntity.ok(claimsService.deleteById(id));
	}

	@DeleteMapping("/deleteAll")
	public ResponseEntity<Object> deleteAll() {
		return ResponseEntity.ok(claimsService.deleteAll());
	}
	
}
