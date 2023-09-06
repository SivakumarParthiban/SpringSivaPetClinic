package com.spring5.sivapetclinic.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="vets")
public class Vet extends Person {
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="vet_speciality", joinColumns= @JoinColumn(name="vet_id"),
									inverseJoinColumns= @JoinColumn(name="speciality_id"))
	private Set<Speciality> specialities;
}
