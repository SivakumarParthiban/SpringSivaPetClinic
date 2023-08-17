package com.spring5.sivapetclinic.service.map;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.spring5.sivapetclinic.model.Owner;
import com.spring5.sivapetclinic.service.CrudService;
import com.spring5.sivapetclinic.service.OwnerService;

@Service
@Profile({"default","map"})
public class OwnerMapService extends AbstractMapService<Owner, Long> implements  OwnerService{

	@Override
	public	Set<Owner> findAll(){
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		
		return super.findById(id);
	}
	
	@Override
	public Owner save(Owner owner)	{
		return super.save(owner);
	}
	


	@Override
	public void delete(Owner t) {
		super.delete(t);
	}

	@Override
	public void deletById(Long id) {
		 super.deleteById(id);
		
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Owner> findAllByLastNameLike(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}


}
