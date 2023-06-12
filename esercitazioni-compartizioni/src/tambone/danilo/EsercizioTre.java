package tambone.danilo;

import java.util.Arrays;

public class EsercizioTre
{

	public static void main(String[] args) 
	{
       String[] array = {"uno", "due", "tre"};
       String[] arrayDue = {"quattro", "cinque", "sei"};
       System.out.println("Primo array " + Arrays.toString(array) + "\n" + "Secondo array " + Arrays.toString(arrayDue));
       System.out.println("-------------Scambio-----------------");
       scambio(array, arrayDue);
       
	}

	static  void scambio(String[] array, String[] arrayDue)
	{
		String x;
		for (int i = 0; i < array.length; i++)
		{
			x = array[i];
			array[i] = arrayDue[i];
			arrayDue[i] = x;
		}
		System.out.println("Primo array " + Arrays.toString(array) + "\n" + "Secondo array " + Arrays.toString(arrayDue));
			
	}
	

		
		

		
		 
}
