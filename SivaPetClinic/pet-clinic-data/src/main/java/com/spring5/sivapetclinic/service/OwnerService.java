package com.spring5.sivapetclinic.service;

import java.util.List;
import java.util.Set;

import com.spring5.sivapetclinic.model.Owner;

public interface OwnerService {
	
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
	Owner findByLastName(String lastName);
	
	List<Owner> findAllByLastNameLike(String lastName);
	

}
