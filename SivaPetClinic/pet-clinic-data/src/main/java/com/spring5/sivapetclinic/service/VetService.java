package com.spring5.sivapetclinic.service;

import java.util.Set;

import com.spring5.sivapetclinic.model.Vet;

public interface VetService {
	Vet findById(Long id);
	Vet save(Vet Vet);
	Set<Vet> findAll();

}
