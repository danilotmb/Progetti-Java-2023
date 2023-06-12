package it.corso.eseguibile;

import java.util.List;

import it.corso.modellazione.Contatto;
import it.corso.modellazione.Indirizzo;
import it.corso.struttura.Database;

public class Main {
	
	private static Database db = new Database();
	public static void main(String[] args) {
		registraIndirizzo("Via pedagna", "40/A", "40064", "Ozzano", "Bologna");
		registraContatto("Riccardo", "Iocolano", "3776777720", "riccardo.iocolano@gmail.com");
		mostraRubrica();
		}

		static void registraIndirizzo(String via, String civico, String cap, String comune, String provincia) {
		Indirizzo indirizzo = new Indirizzo();
		indirizzo.setVia(via);
		indirizzo.setCivico(civico);
		indirizzo.setCap(cap);
		indirizzo.setComune(comune);
		indirizzo.setProvincia(provincia);
		db.createIndirizzo(db.getConnection(), indirizzo);
		}

		static void registraContatto(String nome, String cognome, String telefono, String mail) {
		Contatto contatto = new Contatto();
		contatto.setNome(nome);
		contatto.setCognome(cognome);
		contatto.setTelefono(telefono);
		contatto.setMail(mail);
		db.createContatto(db.getConnection(), contatto);
		}

		static void mostraRubrica() {
		List<Contatto> contatti = db.getContatti(db.getConnection());
		for (Contatto contatto : contatti) {
		System.out.println(contatto);
		}
		}
}
