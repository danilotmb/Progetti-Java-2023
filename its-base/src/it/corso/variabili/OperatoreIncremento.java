package it.corso.variabili;

public class OperatoreIncremento 
{

	public static void main(String[] args) 
	{
		int numeroUno = 10;
		
		//INCREMENTARE DI 1 IL VALORE DI numeroUno 
		//versione prolisssa 
		numeroUno = numeroUno+1;
		System.out.println(numeroUno);
		
		//versione meno prolissa
		numeroUno += 1;
		System.out.println(numeroUno);
		
		//versione ottimizzata
		numeroUno++;
		System.out.println(numeroUno);
		
		
		//DIFFERNZA POST/PRE INCREMENTO 
		System.out.println(numeroUno++);
		System.out.println(++numeroUno);
		
		
		//INCREMENTARE UN PRIMITIVO char
		char carattere = 'A';
		System.out.println(++carattere);
		

	}

}
