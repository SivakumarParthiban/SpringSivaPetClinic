package com.spring5.sivapetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring5.sivapetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>{
	Owner findByLastName(String lastName);

}
