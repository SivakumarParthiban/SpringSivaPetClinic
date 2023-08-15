package com.spring5.sivapetclinic.service;

import java.util.Set;

import com.spring5.sivapetclinic.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();

}
