package com.spring5.sivapetclinic.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.spring5.sivapetclinic.model.Owner;
import com.spring5.sivapetclinic.repositories.OwnerRepository;
import com.spring5.sivapetclinic.service.OwnerService;


@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService{
	
	private OwnerRepository ownerRepository;
	
	
	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners=new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public Owner findById(Long id) {
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner t) {
		return ownerRepository.save(t);
	}

	@Override
	public void delete(Owner t) {
		 ownerRepository.delete(t);
	}

	@Override
	public void deletById(Long id) {
		ownerRepository.deleteById(id);
	}

	public OwnerSDJpaService(OwnerRepository ownerRepository) {
		super();
		this.ownerRepository = ownerRepository;
	}

	@Override
	public Owner findByLastName(String lastName) {
		
		return ownerRepository.findByLastName(lastName);
	}

}
