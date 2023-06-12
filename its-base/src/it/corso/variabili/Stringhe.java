package it.corso.variabili;

public class Stringhe
{

	public static void main(String[] args) 
	{
		//dichiarazione e istanzaione 
		String stringaUno = "Testo uno";
		
		//costruttore == costruire un oggetto in memoria 
		String stringaDue = new String("Testo uno"); 
		
		
		//accesso valori 
		System.out.println(stringaUno);
        System.out.println(stringaDue);
        
        //confronto stringhe 
        
        System.out.println(stringaUno == stringaDue);             //sconsigliato per le stringhe, va bene per i primitivi
        System.out.println(stringaUno.equals(stringaDue));        //cosnigliato
        
        
        //alcuni dei metodi per classi String
        
        System.out.println(stringaUno.length());                  //contare caratteri (compresi gli spazi)
        System.out.println(stringaUno.charAt(1));                 //posizione dei caratteri (indice posizionale partendo da 0)
        System.out.println(stringaUno.indexOf("s"));              //ricerca posizione del carattere scelto
        System.out.println(stringaUno.substring(0, 5));           //stampa dalla posizione 0, alla 5 della stringa(in questo caso)
        System.out.println(stringaUno.substring(3));              //stampa dalla posizione scelta in poi della stringa 
        
        
        //dimostrazione immutabilita' 
        stringaUno.substring(5);
        System.out.println(stringaUno.substring(5));
        stringaUno =   stringaUno.substring(5);
        System.out.println(stringaUno);
        
        //per modificare una stringa devo riassegnarla 
        
	}

}
