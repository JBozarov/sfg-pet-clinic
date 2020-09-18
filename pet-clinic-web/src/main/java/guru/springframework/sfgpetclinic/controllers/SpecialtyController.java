package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.services.SpecialtyService;

@Controller
@RequestMapping("/specailty")
public class SpecialtyController {

	private final SpecialtyService specialtyService;

	public SpecialtyController(SpecialtyService specialtyService) {
		super();
		this.specialtyService = specialtyService;
	} 
	
	@RequestMapping({"", "/", "/index", "index.html"})
	public String foo (Model model) {
		model.addAttribute("specialty", specialtyService.findAll()); 
		return "specailty/index"; 
	}
}
