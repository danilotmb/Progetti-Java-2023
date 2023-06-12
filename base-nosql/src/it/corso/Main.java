package it.corso;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Main {

	private final static String URI="mongodb+srv://danilo:QoLAyR4kNIeDweEm@cluster0.pebr6u0.mongodb.net/";
	public static void main(String[] args)
	{
		//insertPersona();
		//getPersone();
		//getPersona();
		//updatePersona();
		deletePersona();
	}

	
	 static void insertPersona()
	 {
		 Persona persona = new Persona(2, "Sara", "Verdi", 30);
		 
		 MongoClient client = MongoClients.create(URI);
		 
		 
		 MongoDatabase db = client.getDatabase("db_test");
		 MongoCollection<Document> persone = db.getCollection("persone");
		 Document document = new Document();
		 document.put("_id", persona.getId());
		 document.put("nome", persona.getNome());
		 document.put("cognome", persona.getCognome());
		 document.put("eta", persona.getEta());
		 persone.insertOne(document);
		 client.close();
		 
	 }
	 
	 
	 //metodo recupero dell'intera collezione
	 public static void getPersone()
	 {
		 MongoClient client = MongoClients.create(URI);
		 MongoDatabase db = client.getDatabase("db_test");
		 MongoCollection<Document> persone = db.getCollection("persone");
		 for (Document d : persone.find())
		 {
			 System.out.println(d);
			 client.close();
		 }

	 }
	 
	 //recupero documento per id 
	 public static void getPersona()
	 {
		 Persona persona = null;
		 MongoClient client = MongoClients.create(URI);
		 MongoDatabase db = client.getDatabase("db_test");
		 MongoCollection<Document> persone = db.getCollection("persone");
		 Bson filtro = new Document("_id", 1);
		 for(Document d : persone.find(filtro))
		 {
			 persona = new Persona(d.getInteger("_id"), d.getString("nome"), d.getString("cognome"), d.getInteger("eta"));
		 }
		 client.close();
		 System.out.println(persona);
		 
		 
	 }
	 
	 //metodo per aggiornamento valore di un documento
	 public static void updatePersona()
	 {
		 MongoClient client = MongoClients.create(URI);
		 MongoDatabase db = client.getDatabase("db_test");
		 MongoCollection<Document> persone = db.getCollection("persone");
		 Bson nuovoNome = new Document("nome", "Laura");
		 persone.findOneAndUpdate(new Document("_id", 2),
				 new Document("$set", nuovoNome));
		 client.close();
	 }
	 
	 
	 //metodo per cancellare un documento in base all'id
	 public static void deletePersona()
	 {
		 MongoClient client = MongoClients.create(URI);
		 MongoDatabase db = client.getDatabase("db_test");
		 MongoCollection<Document> persone = db.getCollection("persone");
		 persone.findOneAndDelete(new Document("_id", 2));
		 client.close();
	 }
}
