package tambone.danilo;
import tambone.danilo.modellazione;

public class furgoni extends modellazione
{

	private double portata, lunghezza, larghezza, altezza;

	public furgoni(String marca, String modello, String numeroTarga, double prezzo, 
			      double portata,double lunghezza,double larghezza, double altezza) 
	
	            {
		               super(marca, modello, numeroTarga, prezzo);
		               this.portata = portata;
		               this.lunghezza = lunghezza;
		               this.larghezza = larghezza;
		               this.altezza = altezza;
	            }

		public double getPortata() {
			return portata;
		}

		public void setPortata(double portata) {
			this.portata = portata;
		}	

		public double getLunghezza() {
			return lunghezza;
		}

		public void setLunghezza(double lunghezza) {
			this.lunghezza = lunghezza;
		}

		public double getLarghezza() {
			return larghezza;
		}

		public void setLarghezza(double larghezza) {
			this.larghezza = larghezza;
		}

		public double getAltezza() {
			return altezza;
		}

		public void setAltezza(double altezza) {
			this.altezza = altezza;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "\n-------------------" + "\nFURGONE\n" + super.toString() + "\nPortata: " + portata + "\nLunghezza: " + lunghezza +"\nLarghezza: " + larghezza + "\nAltezza: " + altezza;
		}

		
	
}
