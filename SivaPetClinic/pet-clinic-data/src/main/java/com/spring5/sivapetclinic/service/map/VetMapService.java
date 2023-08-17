package com.spring5.sivapetclinic.service.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.spring5.sivapetclinic.model.Pet;
import com.spring5.sivapetclinic.model.Vet;
import com.spring5.sivapetclinic.service.CrudService;
import com.spring5.sivapetclinic.service.VetService;
@Service
@Profile({"default","map"})
public class VetMapService extends AbstractMapService <Vet, Long> implements VetService{

	@Override
	public	Set<Vet> findAll(){
		return super.findAll();
	}
	
	@Override
	public Vet findById(Long id) {
		
		return super.findById(id);
	}
	
	@Override
	public Vet save(Vet vet)	{
		return super.save(vet);
	}
	


	@Override
	public void delete(Vet t) {
		super.delete(t);
	}

	@Override
	public void deletById(Long id) {
		 super.deleteById(id);
		
	}
}
