package tambone.danilo;

import javax.swing.JOptionPane;

public class EsercizioDue 
{

	public static void main(String[] args) 
	{
	   String nome, cognome;
	   boolean bool = true;
       nome = JOptionPane.showInputDialog("Inserisci Nome");
       cognome = JOptionPane.showInputDialog("Inserisci Cognome");
       controllo(nome, cognome, bool);
       if (bool) 
       {
       dominio(nome, cognome);
       password(nome, cognome);
	}else JOptionPane.showMessageDialog(null, "Dati non corretti");
}
	
	static void dominio(String nome, String cognome)
	{
		JOptionPane.showMessageDialog(null, nome.toLowerCase().substring(0,1) + '.' + cognome.toLowerCase() + "@gmail.com");
	}
	
	static void password(String nome, String cognome)
	{
		JOptionPane.showMessageDialog(null, "La tua password e': " + nome.substring(0,3) + cognome.substring(cognome.length()-3, cognome.length()));
	}
	static boolean controllo (String nome, String cognome, boolean bool)
	{
		if (nome.length() < 3 || cognome.length() < 3)
			{
			JOptionPane.showMessageDialog(null, "Dati non corretti, impossibile proseguire");
		    return bool = false;
			}
		    else 
		    	{
		    	return bool = true;
		    	}
	} 
}
