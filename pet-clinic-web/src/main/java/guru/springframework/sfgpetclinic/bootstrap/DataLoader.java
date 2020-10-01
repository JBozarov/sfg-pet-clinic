package guru.springframework.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.OwnerMapService;
import guru.springframework.sfgpetclinic.services.map.VetMapService;

@Component
public class DataLoader implements CommandLineRunner{
	
	private final OwnerService ownerService; 
	private final VetService vetService; 
	private final PetTypeService petTypeService;
	private final SpecialtyService specialtesService; 

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			SpecialtyService specialtesService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialtesService = specialtesService;
	}

	@Override
	public void run(String... args) throws Exception {
		int count = petTypeService.findAll().size();
		if (count == 0) {
			localData();
		}     
	}


	private void localData() {
//		PetType petType1 = new PetType(); 
//		petType1.setName("Dog");
//		PetType savedDogPetType = petTypeService.save(petType1); 
		
		PetType petType2 = new PetType();
		petType2.setName("Cat");
		PetType savedCatPetType = petTypeService.save(petType2); 
		System.out.println("PetType Loaded... ");
		
//		Speciality radiology = new Speciality(); 
//		radiology.setDescription("Radiology"); 
//		Speciality savedRadiology = specialtesService.save(radiology);
//		
//		Speciality surgery = new Speciality(); 
//		surgery.setDescription("Surgery"); 
//		Speciality savedSurgery = specialtesService.save(surgery); 
//		
//		Speciality dentistry = new Speciality(); 
//		dentistry.setDescription("Dentistry"); 
//		Speciality savedDentistry = specialtesService.save(dentistry); 
//      
//		Owner owner1 = new Owner();
//		owner1.setFirstName("Michael");
//		owner1.setLastName("Weston");
//		owner1.setAddress("123 Bricherel");
//		owner1.setCity("Miami");
//		owner1.setTelephone("12121212131");
//		
//		Pet makesPet = new Pet(); 
//		makesPet.setPetType(savedDogPetType);
//		makesPet.setBirthDate(LocalDate.now());
//		makesPet.setName("Rosco");
//		makesPet.setOwner(owner1);
//		owner1.getPets().add(makesPet); 
//		ownerService.save(owner1);
//		
//
//		Owner owner2 = new Owner();
//		owner2.setFirstName("Fiona");
//		owner2.setLastName("Glenanne");
//		owner2.setAddress("123 Bricherel");
//		owner2.setCity("Miami");
//		owner2.setTelephone("12121212131");
//		
//		Pet fionasCat = new Pet(); 
//		fionasCat.setPetType(savedCatPetType);
//		fionasCat.setBirthDate(LocalDate.now());
//		fionasCat.setName("Just Cat");
//		fionasCat.setOwner(owner2);
//		owner2.getPets().add(fionasCat); 
//		ownerService.save(owner2);
//		System.out.println("Loaded Owners....");
//
//		Vet vet1 = new Vet();
//		vet1.setFirstName("Sam");
//		vet1.setLastName("Axe");
//		vet1.getSpecialities().add(savedRadiology); 
//		vetService.save(vet1);
//
//		Vet vet2 = new Vet();
//		vet2.setFirstName("Jessie");
//		vet2.setLastName("Porter");
//		vet2.getSpecialities().add(savedSurgery); 
//		vetService.save(vet2);
//		System.out.println("Loaded Vets....");
	}

	
}
