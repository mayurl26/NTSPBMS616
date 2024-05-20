package com.mednet.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

	@Entity
	@Table(name = "employee_mednet")
	@Getter
	@Setter
	public class Employee {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;

	 private String loginId;
	 private String name;
	 private LocalDate dateOfBirth;
	 private String gender;
	private String Address;
	 private String State;
	private String city;
	 private  String password;
	
}
