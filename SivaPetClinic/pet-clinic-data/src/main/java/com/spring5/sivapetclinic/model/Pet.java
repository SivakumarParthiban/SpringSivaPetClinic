package com.spring5.sivapetclinic.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Pet extends BaseEntity{
	
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;
	
	

}
