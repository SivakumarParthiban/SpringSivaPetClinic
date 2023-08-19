package com.spring5.sivapetclinic.service.map;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.spring5.sivapetclinic.model.Speciality;
import com.spring5.sivapetclinic.service.SpecialityService;

@Service
@Profile({ "default", "map" })
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {

		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality t) {
		return super.save(t);
	}

	@Override
	public void delete(Speciality t) {
		super.delete(t);
	}

	@Override
	public void deletById(Long id) {
		super.deleteById(id);
	}

}
