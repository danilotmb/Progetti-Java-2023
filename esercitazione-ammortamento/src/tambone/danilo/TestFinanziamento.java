package tambone.danilo;
import javax.swing.JOptionPane;


public class TestFinanziamento
{

	public static void main(String[] args)
	{
		  String importo1 = JOptionPane.showInputDialog("Inserire l'importo del finanziamento: ");
		    long importo = Long.parseLong(importo1);
		    
		  String durata1 = JOptionPane.showInputDialog("Inserire la durata del finanziamento: ");
		    int durata = Integer.parseInt(durata1);
		    
		  String rate1 = JOptionPane.showInputDialog("Inserire il numero di rate desiderate: ");
		     int rate = Integer.parseInt(rate1);
		    
		  String tasso1 = JOptionPane.showInputDialog("Inserire il tasso di interesse desiderato: ");
		  int tasso = Integer.parseInt(tasso1);
		     
	
	}
	
}
