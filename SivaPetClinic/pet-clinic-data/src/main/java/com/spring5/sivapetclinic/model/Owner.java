package com.spring5.sivapetclinic.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Owner extends Person{

	private Address address;
	private Set<Pet> pets;
}
