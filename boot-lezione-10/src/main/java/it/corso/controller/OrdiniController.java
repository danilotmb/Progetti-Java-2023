package it.corso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Cliente;
import it.corso.model.Prodotto;
import it.corso.service.ClienteService;
import it.corso.service.OrdineService;
import it.corso.service.ProdottoService;

@Controller
@RequestMapping("/ordini")
public class OrdiniController
{
	@Autowired
	private OrdineService ordineService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ProdottoService prodottoService;
	
	@GetMapping
	public String getPage (Model model)
	{
		List<Cliente> clienti = clienteService.getClienti();
		
		List<Prodotto> prodotti = prodottoService.getProdotti();
		
		
		model.addAttribute("ordini", ordineService.getOrdini());
		model.addAttribute("clienti", clienti);
		model.addAttribute("prodotti", prodotti);
		
		
		return "ordini";
	}
	
	public String registraOrdine (
			@RequestParam("data") String 
			)
	
}
