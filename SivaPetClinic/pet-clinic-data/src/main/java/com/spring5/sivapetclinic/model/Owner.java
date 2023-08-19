package com.spring5.sivapetclinic.model;

import java.util.Set;

import jakarta.persistence.Entity;
import lombok.Data;

@Data

public class Owner extends Person {

	private String address;
	private String city;
	private String zipcode;
	private String telephone;
	private Set<Pet> pets;
}
