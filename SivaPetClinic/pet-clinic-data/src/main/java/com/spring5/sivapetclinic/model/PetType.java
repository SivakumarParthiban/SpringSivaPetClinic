package com.spring5.sivapetclinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="pettype")
public class PetType extends BaseEntity {

	@Column(name="name")
	public String name;

}
