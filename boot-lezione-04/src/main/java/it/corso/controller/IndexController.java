package it.corso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.corso.model.Articolo;
import it.corso.service.ArticoloService;

@Controller
@RequestMapping("/")
public class IndexController 
{
	@Autowired
	ArticoloService articoloService;
	@GetMapping
	public String getPage(Model model)
	{
		List<Articolo> catalogo = articoloService.getCatalogo();
		model.addAttribute("catalogo", catalogo);
		return "index";
	}
}
