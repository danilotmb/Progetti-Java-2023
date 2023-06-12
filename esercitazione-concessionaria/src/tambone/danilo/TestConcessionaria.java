package tambone.danilo;
import java.util.Arrays;

import tambone.danilo.modellazione;
public class TestConcessionaria 
{

	public static void main(String[] args) 
	{
       autovetture auto1 = new autovetture("Audi", "R8", "EF765FE", 150000.0 , "Automatico" , 3);
       autovetture auto2 = new autovetture("Mercedes", "GLA", "FF349GH",49000.0, "Automatico", 5);
       autovetture auto3 = new autovetture("Toyota", "Yaris", "DT989BN", 7000.0, "Manuale", 5);
       furgoni furgone1 = new furgoni("Ford", "TR-9999", "HB101JJ", 72500.0, 20500.0, 1200.00, 400.00, 600.00);
       furgoni furgone2 = new furgoni("Iveco", "Turbo-2000", "LL777NN", 55999.00, 15200.00, 800.00, 300.00, 400.00);
       
       
       modellazione[] modellaziones = { auto1, auto2, auto3, furgone1, furgone2};
       for (modellazione m : modellaziones)
       {
    	  System.out.println(m);
       }
       
       
		
	}

}
