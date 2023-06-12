package it.corso.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Prodotto;
import it.corso.service.ProdottoService;

@Controller
@RequestMapping("/")
public class IndexController
{
	@Autowired
	private ProdottoService prodottoService;
	
	@SuppressWarnings("unchecked")
	
	@GetMapping
	public String getPage(
			HttpSession session,
			Model model)
	{
		if(session.getAttribute("catalogo") == null)
			prodottoService.creaCatalogo(session);
		model.addAttribute("catalogo", (List<Prodotto>) session.getAttribute("catalogo"));
		
		return "index";
	}
	
	
	@GetMapping("/aggiungi")
	public String aggiungiACarrello(
			@RequestParam("id") int idProdotto,
			HttpSession session)
	{
		prodottoService.aggiungiACarrello(session, idProdotto);
		return "redirect:/";
	}
}
