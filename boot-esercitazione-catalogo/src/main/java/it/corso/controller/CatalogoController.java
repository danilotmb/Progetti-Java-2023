package it.corso.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.corso.service.ProdottoService;


@Controller
@RequestMapping("/")
public class CatalogoController 
{
	@Autowired
	ProdottoService prodottoService;
	@GetMapping
	public String getPage(
			HttpSession session,
			Model model)
	{
		prodottoService.creaCatalogo(session);
		model.addAttribute("catalogo", session.getAttribute("catalogo"));
		return "catalogo";
	}
}
