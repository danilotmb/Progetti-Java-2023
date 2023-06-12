package it.corso.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "operazioni")
public class Operazione 
{
	@Id				
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "data")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date data;
	
	
	@Pattern(regexp = "[a-zA-Z0-9\\s]{1,45}", message = "Caratteri non ammessi")
	@Column(name = "descrizione")
	private String descrizione;
	
	@Digits(integer = 8, fraction = 2, message = "Importo non valido")
	@Column(name = "importo")						
	private double importo;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}
	
	
}
