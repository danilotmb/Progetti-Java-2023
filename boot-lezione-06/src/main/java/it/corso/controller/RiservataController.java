package it.corso.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/riservata")
public class RiservataController 
{
	@GetMapping
	public String getPage(
			HttpSession session,
			Model model)
	{
		if(session.getAttribute("utente") == null)
			return "redirect:/login";
		model.addAttribute("utente", session.getAttribute("utente"));
		return "riservata";	
	}
}
