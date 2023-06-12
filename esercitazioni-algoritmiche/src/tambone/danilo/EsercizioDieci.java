package tambone.danilo;
import javax.swing.JOptionPane;


public class EsercizioDieci
 {
   public static void main(String[] args)
   {
        //input
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero intero positivo"));

          //1° controllo: se il numero è minore o uguale a 1 non è un "numero primo"
          String messaggio = numero > 1 ? "Si tratta di un numero primo" : "Numero non primo";

         //2° controllo: se il numero è maggiore di 1 effettuo la verifica
         for(int i = 2; i < numero; i++)
            if(numero % i == 0)
            {
             messaggio = "Numero non primo";
             break;
             }

         //output
         JOptionPane.showMessageDialog(null, messaggio);
 }
 }


