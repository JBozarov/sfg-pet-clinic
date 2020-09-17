package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.services.PetTypeService;

@RequestMapping("/pettypes")
@Controller
public class PetTypeController {
	
	private PetTypeService petTypeService;

	public PetTypeController(PetTypeService petTypeService) {
		this.petTypeService = petTypeService;
	} 
	
	@RequestMapping({"", "/", "/index", "/index.html"})
	public String listOfPetTypes (Model model) {
		model.addAttribute("pettypes", petTypeService.findAll());
		return "pettypes/index"; 
	}
	

}
