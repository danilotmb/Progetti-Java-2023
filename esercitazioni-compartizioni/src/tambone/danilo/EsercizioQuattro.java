package tambone.danilo;

import javax.swing.JOptionPane;

public class EsercizioQuattro 
{

	public static void main(String[] args) 
	{
		final String USERNAME = "Danilo";
		final String PASSWORD = "1234";
		String username, password;
		username = JOptionPane.showInputDialog("Username: ");
		password = JOptionPane.showInputDialog("Password: ");
		Controllo(USERNAME, PASSWORD, username, password);
		
	}

	
     static void Controllo(String USERNAME, String PASSWORD, String username, String password)
     {
    	 if (!USERNAME.equals(username) || !PASSWORD.equals(password))
    	 {
    		 JOptionPane.showMessageDialog(null, "Accesso negato");
    	 }
    	 else 
    	 {
			JOptionPane.showMessageDialog(null, "Accesso autorizzato");
		 }
    		 
     }
}
