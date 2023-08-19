package com.spring5.sivapetclinic.service.map;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.spring5.sivapetclinic.model.Visit;
import com.spring5.sivapetclinic.service.VisitService;

@Service
@Profile({ "default", "map" })
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

	@Override
	public Set<Visit> findAll() {
		return super.findAll();
	}

	@Override
	public Visit findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Visit save(Visit t) {
		if (t.getPet() == null || t.getPet().getOwner() == null || t.getPet().getId() == null
				|| t.getPet().getOwner().getId() == null) {
			throw new RuntimeException("Invalid Visit");
		}
		return super.save(t);
	}

	@Override
	public void delete(Visit t) {
		super.delete(t);
	}

	@Override
	public void deletById(Long id) {
		super.deleteById(id);
	}

}
