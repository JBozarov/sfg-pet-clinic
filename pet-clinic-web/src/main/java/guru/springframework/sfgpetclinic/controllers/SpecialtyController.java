package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.services.SpecialtesService;

@Controller
@RequestMapping("/specailty")
public class SpecialtyController {

	private final SpecialtesService specialtyService;

	public SpecialtyController(SpecialtesService specialtyService) {
		super();
		this.specialtyService = specialtyService;
	} 
	
	@RequestMapping({"", "/", "/index", "index.html"})
	public String foo (Model model) {
		model.addAttribute("specialty", specialtyService.findAll()); 
		return "specailty/index"; 
	}
}
