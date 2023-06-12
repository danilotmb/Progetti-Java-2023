package it.corso.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.corso.model.Utente;
import it.corso.service.UtenteService;

@Controller
@RequestMapping("/")
public class IndexController 
{
	@Autowired
	UtenteService utenteService;
	
	@GetMapping
	public String getPAge(Model model)
	{
		model.addAttribute("utente", new Utente());
		return "index";
	}
	
	@PostMapping
	public String registraUtente(
			@Valid @ModelAttribute("utente") Utente utente,
			BindingResult result,
			HttpSession session)
	{
		if(result.hasErrors())
			return "redirect:/";
		
		session.setAttribute("utente", utente);
		utenteService.registrazioneUtente(utente);
		return "redirect:/";
	}
}
