package tambone.danilo;

import javax.swing.JOptionPane;

public class EsercizioOtto 
{

	public static void main(String[] args) 
	{
		int [] array = new int [3];
		for (int i = 0; i < array.length; i++)
		{
			String numeroInserito = JOptionPane.showInputDialog("Inserisci il " + (i + 1) + " numero intero");  
			array[i] = Integer.parseInt(numeroInserito);	
		}
		int max = array [0];
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > max)
			{
				max = array[i];
			}
		}
		JOptionPane.showMessageDialog(null, "Il numero massimo e' : " + max);
	
		 
	}

}
