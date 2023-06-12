package it.corso.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.corso.model.Utente;

@Controller
@RequestMapping("/reserved")
public class ReservedController 
{
	@GetMapping
	public String getPage(
			HttpSession session, 
			Model model)
	{
		return "reserved";
		
		
	}
}
