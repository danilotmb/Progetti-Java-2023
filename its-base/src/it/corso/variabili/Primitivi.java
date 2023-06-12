package it.corso.variabili;

public class Primitivi
{
   public static void main(String[] args) 
	{
		//dichiarazione e istanzazione contetsuali 
	   byte primitivoByte = 126;
	   char primitivoChar = 'A';                   // singolo apice
	   long primitivoLong = 10_000_000_000L;       //inserisco la L o l per determinare il tipo long 
	   float primitivoFloat = 12.34F;              //inserisco la F o f per destinguerlo dal Double
	   double primitivoDouble = 12.56;
	   boolean primitivoBoolean = true;            //sempre minuscolo
	   
	   //dichiarazione e istanzazione differite 
	   int primitivoIntero;
	   primitivoIntero = 10; 
	   
	   
	   //accesso a valori 
	   System.out.println(primitivoByte);
	   System.out.println(primitivoChar);
	   System.out.println(primitivoLong);
	   System.out.println(primitivoFloat);
	   System.out.println(primitivoDouble);
	   System.out.println(primitivoBoolean);
	   System.out.println(primitivoIntero);
	   
	   
	   //costante 
	   final int NUMERO_COSTANTE = 10;
	   
	   
	   
	   



	}

}
