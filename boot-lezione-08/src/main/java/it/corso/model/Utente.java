package it.corso.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class Utente 
{
	@Pattern(regexp = "[a-zA-Z\\s']{1,255}", message="Carattere non ammessi")
	private String nome;
	
	@Min(value = 1, message = "Utente troppo giovane")
	@Max(value = 120, message = "Utente troppo anziano")
	private int eta;
	
	@Pattern(regexp = "[a-zA-Z0-9.]{1,255}", message = "Username non valido")
	private String username;
	
	@Pattern(regexp = "(?=.*\\d)(?=.*[a-z)(?=.*[A-Z])[0-9a-zA-Z]{6,20}", message = "Password troppo debole")
	private String password;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
