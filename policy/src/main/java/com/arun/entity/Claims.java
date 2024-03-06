package com.arun.entity;

import java.util.Date;

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
@Document(collection = "claims")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Claims {

	@Id
	String id;
	
	String claimNumber;
	
	String lineOfBusiness;
	
	String insuredFullName;
	
	String insuredFName;

	String insuredLName;
	
	Date insuredDOB;
	
	Date dateOfDeath;
	
	String Status;
	
	Date effectiveDate;
	
	String insuredState;
	
}
