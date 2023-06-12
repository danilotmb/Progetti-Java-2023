package it.corso.modellazione;

public class Indirizzo 
{
	private int id;
	private String via;
	private String civico;
	private String cap;
	private String comune;
	private String provincia;
	
	
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
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
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
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	@Override
	public String toString() {
		return "Indirizzo [via=" + via + ", civico=" + civico + ", cap=" + cap + ", comune=" + comune + ", provincia="
				+ provincia + "]";
	}
	
	
	
	
}
