package com.spring5.sivapetclinic.model;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class BaseEntity implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
}
