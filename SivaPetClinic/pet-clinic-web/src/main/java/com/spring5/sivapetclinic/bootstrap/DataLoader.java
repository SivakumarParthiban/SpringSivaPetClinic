package com.spring5.sivapetclinic.bootstrap;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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

		Owner owner1 =Owner.builder().build();
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
		Set<Pet> petsOne=new HashSet();
		
		petsOne.add(mikesPet);
		owner1.setPets(petsOne);

		ownerService.save(owner1);

		Owner owner2 = Owner.builder().build();
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
		Set<Pet> petstwo=new HashSet();
		
		petstwo.add(fionsCat);
		owner2.setPets(petstwo);

		ownerService.save(owner2);

		Visit catVisit = new Visit();
		catVisit.setPet(fionsCat);
		catVisit.setDescription("Sneezy kitty");
		catVisit.setVistTime(LocalDate.now());

		visitService.save(catVisit);

		Vet vet1 = new Vet();
		vet1.setFirstName("William");
		vet1.setLastName("Looney");
		
		Set <Speciality> vetSpecialities1=new HashSet();
		vetSpecialities1.add(savedRadiology);
		
		vet1.setSpecialities(vetSpecialities1);
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Daren");
		vet2.setLastName("Davis");
		Set <Speciality> vetSpecialities2=new HashSet();
		vetSpecialities2.add(savedSurgery);
		
		vet2.setSpecialities(vetSpecialities2);
		vetService.save(vet2);

	}

}
