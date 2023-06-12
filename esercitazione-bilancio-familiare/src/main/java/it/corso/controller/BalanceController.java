package it.corso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Operazione;
import it.corso.service.OperazioneService;

@Controller
@RequestMapping("/")
public class BalanceController 
{
	@Autowired
	private OperazioneService operazioneService;
	
	@GetMapping
	public String getPage(Model model)
	{
		model.addAttribute("operazioni", operazioneService.getOperazioni());
		
		return "balance";
	}
	
	@GetMapping("/cancella")
	public String cencellaOperazione (@RequestParam("id") int id)
	{
		Operazione operazione = operazioneService.getOperazioneById(id);
		operazioneService.cancellaOperazione(operazione);
		
		return "redirect:/";
	}
}
