package it.corso.variabili;

public class OperatoreSommaEAssegnazione 
{

	public static void main(String[] args)
	{
		int numeroUno = 10;
		String stringaUno = "Ciao";
		
		//AMBITO NUMERICO (sommare 5 al valore di numeroUno)
		//versione prolissa 
		numeroUno = numeroUno + 5;
		System.out.println(numeroUno);
		
		//versione ottimizzata
		numeroUno += 5;
		System.out.println(numeroUno);
		
		
		//AMBITO TESTUALE (concatenare " Mondo " a  stringaUno)
		//versione prolissa 
		stringaUno = stringaUno + " Mondo ";
		System.out.println(stringaUno);
		
		
		//versione ottimizata 
		stringaUno += " Mondo ";
		System.out.println(stringaUno);
		
	
		

	}

}
