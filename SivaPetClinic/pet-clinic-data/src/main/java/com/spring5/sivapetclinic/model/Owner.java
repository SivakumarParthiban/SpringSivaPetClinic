package com.spring5.sivapetclinic.model;

import java.util.Objects;
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
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		return Objects.equals(telephone, other.telephone);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(telephone);
		return result;
	}
	
	
}
