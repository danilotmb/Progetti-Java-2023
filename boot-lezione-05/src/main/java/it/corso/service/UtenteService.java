package it.corso.service;

public interface UtenteService 
{
	String REGEX_NOME = "[a-zA-Z\\s']{1,255}";
	String REGEX_USERNAME = "[a-zA-Z._]{1,255}";
	String REGEX_PASSWORD = "[a-zA-Z0-9]{1,255}";
	void registrazioneUtente(String nome, String username, String password);
	boolean controllaDatiUtente(String...dati);
	
}
