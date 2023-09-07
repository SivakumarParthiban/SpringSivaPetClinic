package com.spring5.sivapetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring5.sivapetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>{

}
