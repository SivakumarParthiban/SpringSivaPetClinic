package com.spring5.sivapetclinic.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Speciality  extends BaseEntity{
	
	private String description;

}
