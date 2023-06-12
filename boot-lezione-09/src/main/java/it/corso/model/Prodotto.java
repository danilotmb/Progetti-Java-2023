package it.corso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "prodotti")
public class Prodotto 
{
	@Id				//serve per dichiarare la primary key
	@GeneratedValue (strategy = GenerationType.IDENTITY)		//indica come gestire la chiave primaria, ovvero in questo caso che il DB si occupa della chiave primaria
	private int id;
	
	@Pattern(regexp = "[a-zA-Z0-9\\s]{1,45}", message = "Caratteri non ammessi")
	@Column(name = "descrizione")			//dichiariamo la colonna e tra parentesi scriviamo come si chiama la colonna nel DB e aggiungiamo le validazioni con @Pattern
	private String descrizione;
	
	@Digits(integer = 5, fraction = 2, message = "Prezzo non valido")
	@Column(name = "prezzo")						//per le validazioni del prezzo usiamo @Digits
	private double prezzo;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
}
