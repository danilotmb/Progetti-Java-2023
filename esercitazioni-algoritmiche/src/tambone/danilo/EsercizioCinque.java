package tambone.danilo;

import java.util.Random;

public class EsercizioCinque 
{

	public static void main(String[] args)
	{
	  int min, max;
	  double media, somma;
      int[] array = new int [10];
      
      for (int i = 0; i<array.length; i++)
		{
			array[i] = new Random().nextInt(50) + 1 ;
		}

      min = array[0];
      for (int i = 1; i < array.length; i++)
      {
    	  if(array[i] < min)
    		  min  = array [i];
      }
      
      System.out.println("Il valore minimo e' " + min);
  
      max = array[0];
		for (int i = 1; i <  array.length; i++ )
		{
			if(array[i] > max)
	    		  max  = array [i];
			
		}
		System.out.println("Il valore massimo e' " + max);
		
		
		somma = 0;
		for (int i = 0; i < array.length ; i++)
			somma += array[i];
		
		media = somma/array.length;
		System.out.println("La media aritmetica e' " + media);
		
		
		
		
		
	}

}
