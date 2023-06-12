package tambone.danilo;

import java.util.Random;

public class EsercizioUno 
{

	public static void main(String[] args) 
	{
       int[] array = new int [10];
       funzionePopolamento(array);
       funzioneStampa(array);
	}

	static void funzionePopolamento(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			array[i] = new Random().nextInt(100) + 1 ;
		}
	}
	
	static void funzioneStampa (int[] array)
	{
		for (int i = 0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	
	
}
