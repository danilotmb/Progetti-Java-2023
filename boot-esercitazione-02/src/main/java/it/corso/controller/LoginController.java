package it.corso.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.service.UtenteService;

@Controller
@RequestMapping("/login")
public class LoginController 
{
	@Autowired
	private UtenteService utenteService;
	
	@GetMapping
	public String getpage(
			Model model,
			HttpSession session)
	{
		return "login";
		
	}
	
	@PostMapping
	public String gestioneLogin(
			@RequestParam("username") String username,
			@RequestParam("password") String password,
			HttpSession session)
	{
		if(!utenteService.controlloLogin(session, username, password))
			return "redirect:/login";
	
		return "redirect:/reserved";
	}
}
