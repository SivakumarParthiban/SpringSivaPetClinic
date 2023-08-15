package com.spring5.sivapetclinic.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Person extends BaseEntity{

	public String firstName;
	public String lastName;
}
