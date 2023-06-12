package tambone.danilo;
import javax.swing.JOptionPane;


public class ControlloData 
{

	public static void main(String[] args) 
	{
		
		//dichiaro la variabile messaggio, che verra' modificata in base alle varie situazioni, e la variabile data che riceve l'input 
		String messaggio;
		String data;
		
		//chiedo all'utente di inserire la data 
		data = JOptionPane.showInputDialog(null, "Inserisci una data nel formato gg-mm-aaaa : ");	
	
		//controllo sulla lunghezza della stringa compresi i separatori
		if (data.length() == 10 && data.charAt(2) == '-' && data.charAt(5) == '-')
		{
		  
		//trasformo le varie "celle" della stringa 'data' in numeri interi separando cosi giorno mese e anno 
		   int mese = Integer.parseInt(data.substring(0,2));
		   int giorno = Integer.parseInt(data.substring(3,5));
		   int anno = Integer.parseInt(data.substring(6,9));

		   //controllo che il mese inserito rientri nel range 1-12
		  if ( mese >=1 && mese <= 12)
		  {
			 //calcolo le l'anno e' bisestile o meno 
			boolean bisestile = anno % 400 == 0 || (anno % 4 == 0 && anno % 100 != 0);
			
			//in base al mese, individuo i casi di 30, 31 , 28 o 29 gg 
			switch (mese)
			{
			case 2:
				if (bisestile) //scrivendo solo bisestile presuppongo che la variabile sia sul valore TRUE
					messaggio = giorno >= 1 && giorno <= 29 ? "Data corretta" : "Il range del giorno non e' corretto";
				else
					messaggio = giorno >= 1 && giorno <= 28 ? "Data corretta" : " Il range del giorno non e' corretto";
				break;
				
				//per i mesi 4,6,9,11 i giorni sono 30
			case 4:
			case 6:
			case 9:
			case 11: 
				messaggio = giorno >= 1 && giorno <= 30 ? "Data corretta" : "Il range del giorno non e' corretto";
				break;
				// di default assumo i mesi di 31 gg
			default:
				messaggio = giorno >= 1 && giorno <= 31 ? "Data corretta" : "Il range del giorno non e' corretto";
					
			}
			
		  }
		  //se il mese non rientra nel range, segnalo l'errore all'utente 
		  else
	              {
			     messaggio = "Inserire un mese valido";
	              }
		}
		//concludo la condizione iniziale che la stringa non sia vuota e contenda i separatori, segnalando un eventuale errore all'utente
		  else 
		     {
		        messaggio = "Formato data non corretto";
	         }
		//ritorno a schermo la variabile messaggio, che durante i vari controlli e' cambiata in base ai casi
		JOptionPane.showMessageDialog(null, messaggio);
			

		
	}
}


