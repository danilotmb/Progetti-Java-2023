package it.corso.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Libro;
import it.corso.service.LibroService;

@Controller
@RequestMapping("/registralibro")
public class Form_Libri_Controller
{
	@Autowired
	private LibroService libroService;
	
	@GetMapping
	public String getPage(
			 Model model,
			 @RequestParam(name = "id", required = false) Integer id)
	{
		Libro libro = id == null ? new Libro() : libroService.getLibroById(id);
		model.addAttribute("libro", libro);
		
 		return "formlibri";
	}
	
	@PostMapping
	public String registraLibro(
			@ModelAttribute("libro") Libro libro,
			BindingResult result
			)
	{
		
		if(result.hasErrors())
			return "formlibri";
		
		libroService.registraLibro(libro);
		
		return "redirect:/libri";
	}
}