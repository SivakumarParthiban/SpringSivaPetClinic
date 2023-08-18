package com.spring5.sivapetclinic.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Address extends BaseEntity{

	private String address;
	private String city;
	private String zipcode;
	private String telephone;
}
