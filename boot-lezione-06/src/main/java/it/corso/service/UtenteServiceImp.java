package it.corso.service;

import org.springframework.stereotype.Service;
import javax.servlet.http.HttpSession;

import it.corso.model.Utente;

@Service
public class UtenteServiceImp implements UtenteService 
{

	@Override
	public boolean controlloLogin( HttpSession session, String... credenziali) 
	{
		if(credenziali[0].equalsIgnoreCase(USERNSME_REGISTRATO) &&
				credenziali[1].equalsIgnoreCase(PASSWORD_REGISTRATA))
		{
			Utente utente = new Utente();
			
			utente.setUsername(USERNSME_REGISTRATO);
			utente.setPassword(PASSWORD_REGISTRATA);
			
			session.setAttribute("utente", utente);
			
			return true;
			
		}
		return false;
	}
	
	

}
