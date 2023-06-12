package it.corso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/")
public class IndexController 
{
	@GetMapping
	public String getPage(
			Model model,
			@RequestParam(name = "nome" , required = false) String nome)
	{
		nome = nome != null ? nome : "Ignoto 1";
		model.addAttribute("title", "Home Page");
		model.addAttribute("welcome", "Benvenuto in Home Page");
		model.addAttribute("nome", nome);
		
		return "index";
	}
}
