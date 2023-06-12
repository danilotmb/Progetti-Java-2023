package it.corso.service;
import javax.servlet.http.HttpSession;

public interface UtenteService 
{
	String USERNSME_REGISTRATO = "Danilo";
	String PASSWORD_REGISTRATA = "1234";
	boolean controlloLogin(HttpSession session, String... credenziali);
	
	
	
}
