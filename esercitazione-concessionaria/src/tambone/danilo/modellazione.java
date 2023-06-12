package tambone.danilo;

public class modellazione 
{
  private String marca, modello, numeroTarga;
  private double prezzo;

  
  public modellazione(String marca, String modello, String numeroTarga, Double prezzo) 
  {
	this.marca = marca;
	this.modello = modello;
	this.numeroTarga = numeroTarga;
	this.prezzo = prezzo;
  }


public String getMarca() 
{
	return marca;
}


public void setMarca(String marca) 
{
	this.marca = marca;
}


public String getModello() {
	return modello;
}


public void setModello(String modello)
{
	this.modello = modello;
}


public String getNumeroTarga() {
	return numeroTarga;
}


public void setNumeroTarga(String numeroTarga) 
{
	this.numeroTarga = numeroTarga;
}


public double getPrezzo() 
{
	return prezzo;
}


public void setPrezzo(double prezzo) 
{
	this.prezzo = prezzo;
}


@Override
public String toString() {
	// TODO Auto-generated method stub
	return "\nMarca:  " + marca + "\nModello: " + modello + "\nNumero Targa: " + numeroTarga + "\nPrezzo: " +prezzo;
}
  

  
}
