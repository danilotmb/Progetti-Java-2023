package tambone.danilo;
import java.util.Random;

public class EsercizioSette 
{

	public static void main(String[] args)
	{
		int [][] matrice = new int [2][3];
		
		for (int i = 0; i< matrice.length; i++)
		{
		   for (int j = 0; j < matrice[i].length; j++)
		    {
			matrice[i][j] = new Random().nextInt(50) + 51;
			
		    }
		}
		
	   for(int[] i : matrice)
		 {
		   System.out.println();
		   
		      for(int j : i)
		       {
			   System.out.format("%d\t", j);
		   }
		
		   }
		 
		
		
	}

}
