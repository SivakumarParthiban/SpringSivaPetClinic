package com.spring5.sivapetclinic.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.spring5.sivapetclinic.model.Visit;
import com.spring5.sivapetclinic.repositories.VisitRepository;
import com.spring5.sivapetclinic.service.VisitService;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService{

	private VisitRepository visitRepositories;
	
		
	public VisitSDJpaService(VisitRepository visitRepositories) {
		super();
		this.visitRepositories = visitRepositories;
	}

	@Override
	public Set<Visit> findAll() {

		Set<Visit> visits=new HashSet<>();
		visitRepositories.findAll().forEach(visits::add);
		return visits;
	}

	@Override
	public Visit findById(Long id) {
		return visitRepositories.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit t) {
		return visitRepositories.save(t);
	}

	@Override
	public void delete(Visit t) {
		visitRepositories.delete(t);		
	}

	@Override
	public void deletById(Long id) {
		visitRepositories.deleteById(id);		
	}

}
