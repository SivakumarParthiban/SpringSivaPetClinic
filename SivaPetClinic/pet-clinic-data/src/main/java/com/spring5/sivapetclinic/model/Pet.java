package com.spring5.sivapetclinic.model;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import lombok.Data;

@Data

public class Pet extends BaseEntity {

	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;

	private String name;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return Objects.equals(birthDate, other.birthDate) && Objects.equals(name, other.name)
				&& Objects.equals(owner, other.owner) && Objects.equals(petType, other.petType);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(birthDate, name, owner, petType);
		return result;
	}
	
	

}
