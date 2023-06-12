package it.corso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import it.corso.model.Libro;
import it.corso.service.LibroService;

@Controller
@RequestMapping("/libri")
public class Libri_Controller 
{
	@Autowired
	private LibroService libroService;
	
	@GetMapping
	public String getPage(
			 Model model,
			 @RequestParam(name = "id", required = false) Integer id)
	{
		Libro libro = id == null ? new Libro() : libroService.getLibroById(id);
		
		model.addAttribute("libri", libroService.getLibri());
		model.addAttribute("libro", libro);
		
 		return "formlibri";
	}
	
	@GetMapping("/cancellalibri")
	public String cancellaLibri (@RequestParam("id") int id)
	{
		Libro libro = libroService.getLibroById(id);
		libroService.cancellaLibro(libro);
		
		return "redirect:/libri";
	}
	
	@PostMapping
	public String registraLibro
			(
					@RequestParam(name = "titolo") String titolo,
					@RequestParam(name = "trama") String trama,
					@RequestParam(name = "AutoreNome") String nome,
					@RequestParam(name = "AutoreCognome") String cognome,
					@RequestParam(name = "categoria") String categoria,
					@RequestParam(name = "copertina", required = false) MultipartFile copertina,
					@RequestParam(name = "id_libro") Integer id
			
			)
			
	{
		if(id != 0)
		{
			libroService.modificaLibro(libroService.getLibroById(id), titolo, trama, nome, cognome, categoria, copertina);
			
		}
		else 
		{
			libroService.registraLibro(titolo,trama,nome,cognome,categoria,copertina);
		}
		
		return "redirect:/libri";
	}
}
