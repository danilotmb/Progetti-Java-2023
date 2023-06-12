package it.corso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//localhost:8080/test

@Controller
@RequestMapping("/test")

public class TestController 
{
	//localhost:8080/test/uno
	@GetMapping("/uno")
	@ResponseBody
	public String metodoUno()
	{
		return "Benvenuto in TestController";
	}
	
	//localhost:8080/test/due
	@GetMapping("/due")
	@ResponseBody
	public String metodoDue()
	{
		String html = "<h1>Benvenuto</h1><br><button>Clicca Qui</button>";
		
		return html;
	}
	
	//localhost:8080/test/tre?nome=Danilo&cognome=Tambone
	@GetMapping("/tre")
	@ResponseBody
	public String metodoTre(
			@RequestParam ("nome")  String nome, 
			@RequestParam ("cognome") String cognome)
	{
		String html = "<h1>Benvenuto " + nome + " " + cognome + "</h1><br><button>Clicca Qui</button>";
		
		return html;
	}
	
	//localhost:8080/test/quattro?nome=Danilo&cognome=Tambone
	@GetMapping("/quattro")
	@ResponseBody
	public String metodoQuattro(
			@RequestParam (name = "nome", required = false)  String nome, 
			@RequestParam (name = "cognome", required = false) String cognome)
	{
		nome = nome != null ? nome : "Pippo";
		cognome = cognome != null ? cognome : "Franco";
		String html = "<h1>Benvenuto " + nome + " " + cognome + "</h1><br><button>Clicca Qui</button>";
		
		return html;
	}
	
	
	//localhost:8080/test/cinque?numero=5
	@GetMapping("/cinque")
	@ResponseBody
	public String metodoCinque(@RequestParam(name = "numero", required = false) int numero)
	{
		numero ++;
		String risultato = "Il numero incrementato e': " + numero;
		
		return risultato;
	}
	
	//localhost:8080/test/sei?numero=5
		@GetMapping("/sei")
		@ResponseBody
		public String metodoCinque(@RequestParam(name = "numero", required = false) String numero)
		{
			String risultato = "";
			try 
			{
				int n = Integer.parseInt(numero);
				risultato = "Il numero incrementato e': " + ++n;
			} 
			catch (Exception e) 
			{
				risultato = "Non mi hai passato un numero";
			}
			

			return risultato;
		}
}

