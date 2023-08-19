package com.spring5.sivapetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring5.sivapetclinic.model.Owner;
import com.spring5.sivapetclinic.model.Pet;
import com.spring5.sivapetclinic.model.PetType;
import com.spring5.sivapetclinic.model.Speciality;
import com.spring5.sivapetclinic.model.Vet;
import com.spring5.sivapetclinic.model.Visit;
import com.spring5.sivapetclinic.service.OwnerService;
import com.spring5.sivapetclinic.service.PetTypeService;
import com.spring5.sivapetclinic.service.SpecialityService;
import com.spring5.sivapetclinic.service.VetService;
import com.spring5.sivapetclinic.service.VisitService;
import com.spring5.sivapetclinic.service.map.OwnerMapService;
import com.spring5.sivapetclinic.service.map.VetMapService;

@Component
public class DataLoader implements CommandLineRunner {
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialityService specialityService;
	private final VisitService visitService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			VisitService visitService, SpecialityService specialityService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialityService = specialityService;
		this.visitService = visitService;
	}

	@Override
	public void run(String... args) throws Exception {

		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);

		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);

		Speciality radiology = new Speciality();
		radiology.setDescription("Radiology");
		Speciality savedRadiology = specialityService.save(radiology);

		Speciality surgery = new Speciality();
		surgery.setDescription("Surgery");
		Speciality savedSurgery = specialityService.save(surgery);

		Owner owner1 = new Owner();
		owner1.setFirstName("Sivakumar");
		owner1.setLastName("Parthiban");
		owner1.setAddress("Cloudless bliss dr");
		owner1.setCity("Tampa");
		owner1.setZipcode("33635");
		owner1.setTelephone("123456789");

		Pet mikesPet = new Pet();
		mikesPet.setBirthDate(LocalDate.now());
		mikesPet.setPetType(savedDogPetType);
		mikesPet.setOwner(owner1);
		mikesPet.setName("Nandu");
		owner1.getPets().add(mikesPet);

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Brinda");
		owner2.setLastName("Kumaraswamy");
		owner2.setAddress("Cloudless bliss dr");
		owner2.setCity("Tampa");
		owner2.setZipcode("33635");
		owner2.setTelephone("234567890");

		Pet fionsCat = new Pet();
		fionsCat.setBirthDate(LocalDate.now());
		fionsCat.setPetType(savedCatPetType);
		fionsCat.setOwner(owner2);
		fionsCat.setName("Bangi");
		owner2.getPets().add(fionsCat);

		ownerService.save(owner2);

		Visit catVisit = new Visit();
		catVisit.setPet(fionsCat);
		catVisit.setDescription("Sneezy kitty");
		catVisit.setVistTime(LocalDate.now());

		visitService.save(catVisit);

		Vet vet1 = new Vet();
		vet1.setFirstName("William");
		vet1.setLastName("Looney");
		vet1.getSpecialities().add(savedRadiology);
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Daren");
		vet2.setLastName("Davis");
		vet1.getSpecialities().add(savedSurgery);

		vetService.save(vet2);

	}

}
