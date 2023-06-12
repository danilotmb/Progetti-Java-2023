package tambone.danilo;
import javax.swing.JOptionPane;
public class EsercizioTre 
{

	public static void main(String[] args) 
	{
      String nome, sesso;
      nome = JOptionPane.showInputDialog("Digita il nome: ");
      sesso = JOptionPane.showInputDialog("Digita il tuo sesso: ");
      if (sesso.equals("Maschio") || sesso.equals("M"))
      {
    	  JOptionPane.showMessageDialog(null, "Benvenuto " + nome);
      }
      else if (sesso.equals("Femmina") || sesso.equals("F"))
      {
    	  JOptionPane.showMessageDialog(null, "Benvenuta " + nome);
	  }
      else if (sesso.equals("") || nome.equals(""))
      {
	       JOptionPane.showMessageDialog(null, "Non hai digitato niente");
      }
      else 
      {
    	  JOptionPane.showConfirmDialog(null, "Benvenut* " + nome);
      }
    	  
      
		
		
	}

}
