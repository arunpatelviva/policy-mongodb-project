package com.arun.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "policyHolders")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PolicyHolders {

	@Id
	String id;

	String insuredFirstName;

	String insuredLastName;

	Integer Age;

	LocalDate DateOfBirth;

	String State;

	String email;
	
	String PhoneNumber;
	
	String Status;
	
	List<String> Beneficiaries;
	
	String Relationship;

}
