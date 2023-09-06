package com.spring5.sivapetclinic.model;

import java.util.Objects;
import java.util.Set;
import lombok.Data;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name="owners")
public class Owner extends Person {

	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="zipcode")
	private String zipcode;
	
	@Column(name="telephone")
	private String telephone;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="owner")
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
