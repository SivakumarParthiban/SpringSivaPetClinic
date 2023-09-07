package com.spring5.sivapetclinic.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.spring5.sivapetclinic.model.PetType;
import com.spring5.sivapetclinic.repositories.PetTypeRepository;
import com.spring5.sivapetclinic.service.PetTypeService;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService{

	private PetTypeRepository petTypeRepository;
	
	

	public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
		super();
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<PetType> findAll() {
	Set<PetType> pettypes=new HashSet<>();
	petTypeRepository.findAll().forEach(pettypes::add);
	
		return null;
	}

	@Override
	public PetType findById(Long id) {
		return petTypeRepository.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType t) {
		return petTypeRepository.save(t);
	}

	@Override
	public void delete(PetType t) {
		petTypeRepository.delete(t);		
	}

	@Override
	public void deletById(Long id) {
		petTypeRepository.deleteById(id);		
	}
	
	

}
