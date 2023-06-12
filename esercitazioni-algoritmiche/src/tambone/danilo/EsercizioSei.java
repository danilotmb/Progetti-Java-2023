package tambone.danilo;
import javax.swing.JOptionPane;

public class EsercizioSei 
{

	public static void main(String[] args) 
	{
		int numeroUno, numeroDue, numeroTre;

		String inputNumeroUno = JOptionPane.showInputDialog("Digita il primo numero :");
        numeroUno = Integer.parseInt(inputNumeroUno);
        
        do
        {
        	String inputNumeroDue = JOptionPane.showInputDialog("Digita il secondo numero :");
            numeroDue = Integer.parseInt(inputNumeroDue);
        	
        }while (numeroUno > numeroDue);
		
        if (numeroUno % 2 == 0)
        {
				numeroTre = numeroUno;
        }
        else 
            {
        	    numeroTre = numeroUno + 1;
		    }
        
        
			
		while (numeroTre <= numeroDue)
		{
			System.out.println(numeroTre);
			numeroTre += 2;
		}
        
        
        
	}

}
