package it.corso.service;

import javax.servlet.http.HttpSession;

import it.corso.model.Utente;

public interface UtenteService 
{
	void registrazioneUtente (Utente utente);
	boolean controlloLogin(HttpSession session, String username, String password);
}
