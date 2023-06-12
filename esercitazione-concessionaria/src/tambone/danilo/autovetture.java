package tambone.danilo;
import tambone.danilo.modellazione;

public class autovetture extends modellazione
{
     private String cambio;
     private int porte;
	
     
     public autovetture(String marca, String modello, String numeroTarga, Double prezzo, String cambio, int porte) 
     {
		super(marca, modello, numeroTarga, prezzo);
		this.cambio = cambio;
		this.porte = porte;
	 }


	public String getCambio() {
		return cambio;
	}


	public void setCambio(String cambio) {
		this.cambio = cambio;
	}


	public int getPorte() {
		return porte;
	}


	public void setPorte(int porte) {
		this.porte = porte;
	}


	@Override
	public String toString() {
		
		return "\n-------------------" + "\nAUTOVETTURA\n" + super.toString()  + "\nTipo Cambio: " + cambio + "\nN. Porte: " + porte;
	}


	
     
     
     
     
     
     
}
