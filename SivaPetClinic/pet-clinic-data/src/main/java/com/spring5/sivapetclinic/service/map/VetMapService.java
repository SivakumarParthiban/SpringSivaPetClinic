package com.spring5.sivapetclinic.service.map;

import java.util.Set;

import com.spring5.sivapetclinic.model.Pet;
import com.spring5.sivapetclinic.model.Vet;
import com.spring5.sivapetclinic.service.CrudService;

public class VetMapService extends AbstractMapService <Vet, Long> implements CrudService<Vet,Long>{

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
