package it.corso.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import it.corso.model.Utente;

@Service
public class UtenteServiceImpl implements UtenteService {

	@Override
	public void registrazioneUtente(Utente utente) 
	{
		System.out.println("Utente registrato: /n" + utente.toString());	
	}

	@Override
	public boolean controlloLogin(HttpSession session, String username, String password) 
	{
		Utente utente = (Utente) session.getAttribute("utente");
			if(utente.getUsername().equals(username) && 
				utente.getPassword().equals(password))
					return true;
			
		return false;
	}
	
}
