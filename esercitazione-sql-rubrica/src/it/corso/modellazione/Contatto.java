package it.corso.modellazione;

public class Contatto 
{
	private int id;
	private String nome;
	private String cognome;
	private String telefono;
	private String mail;
	private Indirizzo indirizzo;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	
	@Override
	public String toString() {
		return "Contatto [nome=" + nome + ", cognome=" + cognome + ", telefono=" + telefono + ", mail=" + mail
				+ ", indirizzo=" + indirizzo + "]";
	}
	
	
	
	
	
	
}
