package it.corso.service;

import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import it.corso.model.Utente;

@Service
public class UtenteServiceImpl implements UtenteService 
{

	@Override
	public void registrazioneUtente(String nome, String username, String password) 
	{
		Utente utente = new Utente();
		
		utente.setNome(nome);
		utente.setUsername(username);
		utente.setPassword(password);
		
		System.out.println("Utente " + utente.getNome() + " registrato");
		
		

	}

	@Override
	public boolean controllaDatiUtente(String... dati) {
		
		return 
				Pattern.matches(REGEX_NOME, dati[0]) &&
				Pattern.matches(REGEX_USERNAME, dati[1]) &&
				Pattern.matches(REGEX_PASSWORD, dati[2]);
		
	}

}
