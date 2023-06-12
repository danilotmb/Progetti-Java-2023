package tambone.danilo;
import java.util.Scanner;
public class EsercizioQuattro 
{

	public static void main(String[] args) 
	{
      Scanner scanner = new Scanner(System.in);
      String nome, nomeDue;
		System.out.println("Digita il tuo nome di battesimo :");
        nome = scanner.nextLine();
        nomeDue = "";
        
        for (int i =nome.length() - 1; i>= 0; i--)
        {
        	nomeDue += nome.charAt(i);
        }
        
        
        System.out.println(nomeDue);
         
		scanner.close();
		
	}

}
