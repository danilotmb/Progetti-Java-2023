package it.corso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Contatto;
import it.corso.service.ContattoService;

@Controller
@RequestMapping("/contatti")
public class ContattoController 
{
	@Autowired
	private ContattoService contattoService;
	
	@GetMapping
	public String getPage(Model model)
	{
		model.addAttribute("contatti", contattoService.getContatti());
		model.addAttribute("contatto", new Contatto());
		
		return "index";
	}
	
	@PostMapping
	public String registraContatto(@ModelAttribute("contatto") Contatto contatto)
	{
		contattoService.registraContatto(contatto);
		
		return "redirect:/contatti";
	}
	
	@GetMapping("/cancellacontatto")
	public String cancellaContatto (@RequestParam("id") int id)
	{
		Contatto contatto = contattoService.getContattoById(id);
		contattoService.cancellaContatto(contatto);
		
		return "redirect:/contatti";
	}
}
