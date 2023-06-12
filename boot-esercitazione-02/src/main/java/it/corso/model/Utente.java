package it.corso.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class Utente 
{
	@Pattern(regexp = "[a-zA-Z\\s']{1,255}", message="Carattere non ammessi")
	private String nome;
	
	@Pattern(regexp = "[a-zA-Z']{1,255}", message="Carattere non ammessi")
	private String cognome;
	
	@Pattern(regexp = "[a-zA-Z.@\\d]{1,255}", message="Carattere non ammessi")
	private String mail;
	
	@Pattern(regexp = "[A-Z\\d]{1,255}", message="Carattere non ammessi")
	private String cf;
	
	@Pattern(regexp = "[a-zA-Z'\\s]{1,255}", message="Carattere non ammessi")
	private String via;
	
	@Min(value = 1, message = "Civico troppo basso")
	@Max(value = 1000, message = "Civico troppo alto")
	private int civico;
	
	@Min(value = 1, message = "Civico troppo basso")
	private int caap;
	
	@Pattern(regexp = "[a-zA-Z\\s']{1,255}", message="Carattere non ammessi")
	private String comune;
	
	@Pattern(regexp = "[a-zA-Z\\s']{1,255}", message="Carattere non ammessi")
	private String provincia;
	
	
	@Pattern(regexp = "[a-zA-Z0-9.]{1,255}", message = "Username non valido")
	private String username;
	
	//@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{6,20}", message = "Password troppo debole")
	private String password;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getCivico() {
		return civico;
	}

	public void setCivico(int civico) {
		this.civico = civico;
	}

	public int getCaap() {
		return caap;
	}

	public void setCaap(int caap) {
		this.caap = caap;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
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

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", mail=" + mail + ", cf=" + cf + ", via=" + via
				+ ", civico=" + civico + ", caap=" + caap + ", comune=" + comune + ", provincia=" + provincia
				+ ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	
}
