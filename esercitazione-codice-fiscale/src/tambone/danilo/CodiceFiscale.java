package tambone.danilo;

import java.util.Scanner;

public class CodiceFiscale 
{

	public static void main(String[] args)
	{
		String nome, cognome, genere, annoNascita,codicecat;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digita il tuo nome :");
        nome = scanner.next();
        System.out.println("Digita il tuo cognome :");
        cognome = scanner.next();
        System.out.println("Digita il tuo anno di nascita nel formato gg-mm-aaaa: ");
        annoNascita = scanner.next();
        System.out.println("Digita in che genere ti identifichi M o F : ");
        genere = scanner.next();
        System.out.println("Digita il codice catastale della tua citta' di nascita :'");
        codicecat = scanner.next();
        
        controllo1 (nome, cognome);
        
        

        
        
        
        
        
        scanner.close();
		
		
	}

	
	static void controllo1 (String nome, String cognome)
	{
		
		
		 
		
	}
}
