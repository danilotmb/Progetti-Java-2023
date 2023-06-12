package it.corso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "indirizzi")
public class Indirizzo 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "via_indirizzo")
	private String via;
	
	@Column(name = "civico_indirizzo")
	private String civico;
	
	@Column(name = "caap_indirizzo")
	private int caap;
	
	@Column(name = "comune_indirizzo")
	private String comune;
	
	@Column(name = "provincia_indirizzo")
	private String provincia;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getCivico() {
		return civico;
	}

	public void setCivico(String civico) {
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
}
