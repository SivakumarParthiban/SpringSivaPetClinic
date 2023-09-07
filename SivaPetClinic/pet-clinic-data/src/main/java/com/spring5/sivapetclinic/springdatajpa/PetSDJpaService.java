package com.spring5.sivapetclinic.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.spring5.sivapetclinic.model.Pet;
import com.spring5.sivapetclinic.repositories.PetRepository;
import com.spring5.sivapetclinic.service.PetService;


@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService{

	private PetRepository petRepository;
	
	public PetSDJpaService(PetRepository petRepository) {
		super();
		this.petRepository = petRepository;
	}

	@Override
	public Set<Pet> findAll() {
	 Set<Pet> pets=new HashSet<>();	
	 petRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pet save(Pet t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Pet t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
