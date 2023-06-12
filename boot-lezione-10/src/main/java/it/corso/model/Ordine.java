package it.corso.model;

import java.time.LocalDate;
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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordini")
public class Ordine 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "data")
	private LocalDate data;
	
	@Column(name = "importo")
	private double importo;
	
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "id_cliente", referencedColumnName = "id")
	private Cliente cliente;
	
	
	@ManyToMany
	(
		cascade = CascadeType.REFRESH, 
		fetch = FetchType.EAGER
	)
	@JoinTable
	(
		name = "ordini_prodotti",
		joinColumns = @JoinColumn(name = "id_ordine", referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name = "id_prodotto", referencedColumnName = "id")
	)
	private List<Prodotto> prodotti = new ArrayList<>();
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Prodotto> getProdotti() {
		return prodotti;
	}
	public void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public double getImporto() {
		return importo;
	}
	public void setImporto(double importo) {
		this.importo = importo;
	}
	
	
}
