package com.spring5.sivapetclinic.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name="visits")
public class Visit extends BaseEntity {

	@Column(name="visit_time")
	private LocalDate vistTime;

	@Column(name="description")
	private String description;

	@ManyToOne
	@JoinColumn(name="pet_id")							
	private Pet pet;

}
