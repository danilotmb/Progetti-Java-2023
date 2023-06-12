package tambone.danilo;

import javax.swing.JOptionPane;

public class MorraCinese 
{

	public static void main(String[] args)
	{
      String giocatore1 = JOptionPane.showInputDialog("Inserisci il nome del Giocatore 1: ");
      String giocatore2 =  JOptionPane.showInputDialog("Inserisci il nome del Giocatore 2: ");
      String scelta1 = JOptionPane.showInputDialog(giocatore1 + "fai la tua scelta tra Sasso (S), Carta(C) o Forbici (F)");
      String scelta2 = JOptionPane.showInputDialog(giocatore2 + "fai la tua scelta tra Sasso (S), Carta(C) o Forbici (F)");
      
      if (scelta1.equals("S"))
      {
    	  if(scelta2.equals("S"))
    	  {
    		  JOptionPane.showMessageDialog(null, "Pareggio");
    	  }
    	  else if (scelta2.equals("C"))
    	  {
    		  JOptionPane.showMessageDialog(null, "Vince " + giocatore2);
    	  }
    	  else 
    	  {
    		  JOptionPane.showMessageDialog(null, "Vince " + giocatore1);
    	  }
      }
      
      
      if (scelta1.equals("C"))
      {
    	  if(scelta2.equals("C"))
    	  {
    		  JOptionPane.showMessageDialog(null, "Pareggio");
    	  }
    	  else if (scelta2.equals("F"))
    	  {
    		  JOptionPane.showMessageDialog(null, "Vince " + giocatore2);
    	  }
    	  else 
    	  {
    		  JOptionPane.showMessageDialog(null, "Vince " + giocatore1);
    	  }
      }      
      if (scelta1.equals("F"))
      {
    	  if(scelta2.equals("F"))
    	  {
    		  JOptionPane.showMessageDialog(null, "Pareggio");
    	  }
    	  else if (scelta2.equals("S"))
    	  {
    		  JOptionPane.showMessageDialog(null, "Vince " + giocatore2);
    	  }
    	  else 
    	  {
    		  JOptionPane.showMessageDialog(null, "Vince " + giocatore1);
    	  }
      }
    		
	}

}
