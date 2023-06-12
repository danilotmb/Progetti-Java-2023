package it.corso.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Operazione;
import it.corso.service.OperazioneService;

@Controller
@RequestMapping("/form")
public class OperationController 
{
	@Autowired
	private OperazioneService operazioneService;
	
	@GetMapping
	public String getPage(
			Model model,
			@RequestParam(name = "id", required = false) Integer id)
	{
		Operazione operazione = id == null ? new Operazione() : operazioneService.getOperazioneById(id);
		model.addAttribute("operazione", operazione);
		
		return "operation";
	}
	
	@PostMapping
	public String registraOperazione (
			@Valid @ModelAttribute("operazione") Operazione operazione,
			BindingResult result)
	{
			if(result.hasErrors())	
				return "operation";
			
			operazioneService.registraOperazione(operazione);
			
		return "redirect:/";
	}
	
	
}
