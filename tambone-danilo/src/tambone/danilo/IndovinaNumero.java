package tambone.danilo;

import java.util.Random;

import javax.swing.JOptionPane;

public class IndovinaNumero 
{

	public static void main(String[] args) 
	{
      final int COSTANTE = new Random().nextInt(10) + 1 ;
      int numero;
      String input;
      int i = 0;
	    
      do {
    	     input = JOptionPane.showInputDialog("Inserisci un numero compreso tra 1 e 10 (compresi) ");
    	     numero = Integer.parseInt(input);
    	     if (numero > COSTANTE)
    	     {
    	    	 JOptionPane.showMessageDialog(null, "Il numero e' minore");
    	    	 i++;
    	     }
    	     else if (numero == COSTANTE)
    	     {
    	    	 i++;
    	    	 break;     //ho dovuto inserirlo per non visuallire una volta di troppo gli altri due casi
    	     }
    	     else 
    	     {
    	    	 JOptionPane.showMessageDialog(null, "Il numero e' maggiore!");
	    	     i++;
    	     }
    	    
    	     
      }while (COSTANTE != numero );
      
      JOptionPane.showMessageDialog(null, "Congratulazioni, hai indovinato in " + i + " tentativi");
      
      
      
      
	}
}


