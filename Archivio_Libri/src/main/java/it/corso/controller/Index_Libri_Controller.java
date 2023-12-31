package it.corso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Libro;
import it.corso.service.LibroService;

@Controller
@RequestMapping("/libri")
public class Index_Libri_Controller 
{
	@Autowired
	private LibroService libroService;
	
	@GetMapping
	public String getPage(Model model)
	{
		List<Libro> libri = libroService.getLibri();
		model.addAttribute("libri", libri);
		return "indexlibri";
	}
	
	@GetMapping("/cancellalibri")
	public String cancellaLibri (@RequestParam("id") int id)
	{
		Libro libro = libroService.getLibroById(id);
		libroService.cancellaLibro(libro);
		
		return "redirect:/libri";
	}
}
