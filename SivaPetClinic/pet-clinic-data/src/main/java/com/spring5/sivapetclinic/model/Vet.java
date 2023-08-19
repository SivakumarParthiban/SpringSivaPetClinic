package com.spring5.sivapetclinic.model;

import java.util.Set;

import jakarta.persistence.Entity;
import lombok.Data;

@Data

public class Vet extends Person {
	private Set<Speciality> specialities;
}
