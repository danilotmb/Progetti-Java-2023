package tambone.danilo;

import java.util.Arrays;
import java.util.Scanner;

public class RubricaEseguibile 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++)
		{
			
			System.out.println("Digita il nome: ");
	        String nome= scanner.next();
	        System.out.println("Digita il cognome : ");
	        String cognome = scanner.next();
	        System.out.println("Digita il numero di telefono: ");
	        String numero = scanner.next();
		
		
		
		RubricaContatti c1 = new RubricaContatti(nome, cognome, numero);
		RubricaContatti.setContacts(i, c1);
		
		}
	       System.out.println(Arrays.toString(RubricaContatti.getContacts()));

	       scanner.close();
	}

}
