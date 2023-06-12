package tambone.danilo;

import javax.swing.JOptionPane;

public class ConvertitoreTemperatura 
{

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog("Inserisci la temperatura in Gradi Centigradi ");
	    double numero = Integer.parseInt(input);
	    JOptionPane.showMessageDialog(null, "La temperatura e' " + numero + " gradi Centigradi");
	    conversioneF (numero);
	    conversioneK (numero);
	    
	}
	
	static void conversioneF (double numero)
	{
		double numeroF = (numero * 9/5) + 32; 
		JOptionPane.showMessageDialog(null, "In Fahrenheit e' di " + numeroF + " gradi");
	}
	
	static void conversioneK (double numero)
	{
		double numeroK = (numero + 273.15);
		JOptionPane.showMessageDialog(null, "In Kelvin e' di " + numeroK + " gradi ");
		
	}

}
