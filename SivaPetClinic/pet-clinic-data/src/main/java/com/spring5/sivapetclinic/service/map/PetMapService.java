package com.spring5.sivapetclinic.service.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.spring5.sivapetclinic.model.Owner;
import com.spring5.sivapetclinic.model.Pet;
import com.spring5.sivapetclinic.service.CrudService;
import com.spring5.sivapetclinic.service.PetService;


@Service
@Profile({"default","map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService{
	
	@Override
	public	Set<Pet> findAll(){
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id) {
		
		return super.findById(id);
	}
	
	@Override
	public Pet save(Pet pet)	{
		return super.save(pet);
	}
	


	@Override
	public void delete(Pet t) {
		super.delete(t);
	}

	@Override
	public void deletById(Long id) {
		 super.deleteById(id);
		
	}

}
