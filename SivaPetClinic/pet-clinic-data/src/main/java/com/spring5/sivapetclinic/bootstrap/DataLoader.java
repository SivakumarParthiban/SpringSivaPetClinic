package com.spring5.sivapetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring5.sivapetclinic.model.Owner;
import com.spring5.sivapetclinic.model.Vet;
import com.spring5.sivapetclinic.service.OwnerService;
import com.spring5.sivapetclinic.service.VetService;
import com.spring5.sivapetclinic.service.map.OwnerMapService;
import com.spring5.sivapetclinic.service.map.VetMapService;

@Component
public class DataLoader implements CommandLineRunner {
	public OwnerService ownerService;
	public VetService vetService;
	
	

	public DataLoader() {
		ownerService=new OwnerMapService();
		vetService=new VetMapService();
	}



	@Override
	public void run(String... args) throws Exception {
			
		Owner owner1=new Owner();
		owner1.setFirstName("Sivakumar");
		owner1.setId(1L);
		owner1.setLastName("Parthiban");
		
		ownerService.save(owner1);
		
		Owner owner2=new Owner();
		owner1.setFirstName("Brinda");
		owner1.setId(2L);
		owner1.setLastName("Kumaraswamy");
		
		ownerService.save(owner2);
		
		Vet vet1=new Vet();
		vet1.setFirstName("William");
		vet1.setLastName("Looney");
		vet1.setId(3L);
		
		vetService.save(vet1);
		
		
		Vet vet2=new Vet();
		vet1.setFirstName("Daren");
		vet1.setLastName("Davis");
		vet1.setId(4L);
		
		vetService.save(vet2);
		
	}

}
