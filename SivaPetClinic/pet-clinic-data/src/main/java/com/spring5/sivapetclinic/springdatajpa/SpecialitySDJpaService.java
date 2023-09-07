package com.spring5.sivapetclinic.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.spring5.sivapetclinic.model.Speciality;
import com.spring5.sivapetclinic.repositories.SpecialityRepositry;
import com.spring5.sivapetclinic.service.SpecialityService;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService{

	private SpecialityRepositry specialityRepository;
	
	
	
	public SpecialitySDJpaService(SpecialityRepositry specialityRepository) {
		super();
		this.specialityRepository = specialityRepository;
	}

	@Override
	public Set<Speciality> findAll() {
	Set<Speciality> specialities=new HashSet<>();
	specialityRepository.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public Speciality findById(Long id) {
		
		return specialityRepository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality t) {
			return specialityRepository.save(t);
	}

	@Override
	public void delete(Speciality t) {
		specialityRepository.delete(t);		
	}

	@Override
	public void deletById(Long id) {
		specialityRepository.deleteById(id);		
	}

}
