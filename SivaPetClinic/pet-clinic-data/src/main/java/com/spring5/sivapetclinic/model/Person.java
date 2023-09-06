package com.spring5.sivapetclinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class Person extends BaseEntity {
	@Column(name="first_name")
	public String firstName;
	
	@Column(name="last_name")
	public String lastName;
}
