package com.spring5.sivapetclinic.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.Data;

@Data

public class Visit extends BaseEntity {

	private LocalDate vistTime;

	private String description;

	private Pet pet;

}
