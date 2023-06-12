package tambone.danilo;

public class EsercizioNove
{

	public static void main(String[] args) 
	{
       String [][] matrice = new String [10][10];
       for (int i = 0; i < matrice.length; i++)
       {
    	   for (int j = 0; j < matrice[i].length; j++)
    	   {
    		   if ((j%2)==0)
    		   {
    			   matrice[i][j] = "X";
    		   }
    		   else 
    		   {
    			matrice[i][j] = "O";   
    		   }
    	   }
    	   
       }

	   for(String[] i : matrice)
		 {
		   System.out.println();
		   
		      for(String j : i)
		       {
			     System.out.format(j + " ");
		       }
		
		   }
	}

}
