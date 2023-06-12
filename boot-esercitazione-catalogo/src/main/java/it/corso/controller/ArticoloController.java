package it.corso.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Prodotto;

@Controller
@RequestMapping("/dettaglio")
public class ArticoloController
{
	@GetMapping
	public String getPageArticolo (
			HttpSession session,
			@RequestParam (name = "id") int id,
			Model model)
	{
		@SuppressWarnings("unchecked")
		List<Prodotto> catalogo = (List<Prodotto>) session.getAttribute("catalogo");
		Prodotto prodotto = catalogo.get(id-1);
		model.addAttribute("prodotto" , prodotto);

		return "dettaglio";
	}
}
