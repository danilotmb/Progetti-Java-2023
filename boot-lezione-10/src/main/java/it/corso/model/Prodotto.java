package it.corso.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "prodotti")
public class Prodotto 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "descrizione")
	private String descrizione;
	
	@Column(name = "prezzo")
	private double prezzo;
	
	@ManyToMany
	(
		cascade = CascadeType.REFRESH, 
		fetch = FetchType.EAGER
	)
	@JoinTable
	(
		name = "ordini_prodotti",
		joinColumns = @JoinColumn(name = "id_prodotto", referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name = "id_ordine", referencedColumnName = "id")
	)
	private List<Ordine> ordini = new ArrayList<>();
	
	
	public List<Ordine> getOrdini() {
		return ordini;
	}
	public void setOrdini(List<Ordine> ordini) {
		this.ordini = ordini;
	}
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
