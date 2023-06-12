package it.corso.struttura;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import it.corso.modellazione.Contatto;
import it.corso.modellazione.Indirizzo;



public class Database
{
	//costanti per la connessione con il db
	private final String URL = "jdbc:mysql://localhost/rubrica";
	private final String USERNAME = "root";
	private final String PASSWORD = "CFIferrara2023!";
	
	//metodo per ottenere la connessione al db
	public Connection getConnection()
	{
		Connection connection = null;
		try
		{
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return connection;
	}
	
	//metodo per recuperare l'intero elenco degli ordini
	public List<Contatto> getContatti(Connection conn)
	{
		List<Contatto> contatti = new ArrayList<>();
		
		String sql = "SELECT C.nome, C.cognome FROM contatto C"
				+ "JOIN indirizzi I ON C.id_indirizzo = I.id";
		
		try(Connection connection = conn;
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql))
		{
			while(resultSet.next())
			{
				
				//istanziazione e valorizzazione indirizzo cliente
				Indirizzo indirizzo = new Indirizzo();
				indirizzo.setVia(resultSet.getString("indirizzi.via"));
				indirizzo.setCivico(resultSet.getString("indirizzi.civico"));
				indirizzo.setCap(resultSet.getString("indirizzi.cap"));
				indirizzo.setComune(resultSet.getString("indirizzi.comune"));
				indirizzo.setProvincia(resultSet.getString("indirizzi.provincia"));
				
				//istanziazione e valorizzazione cliente ordine
				Contatto contatto = new Contatto();
				contatto.setNome(resultSet.getString("clienti.nome"));
				contatto.setCognome(resultSet.getString("clienti.cognome"));
				contatto.setMail(resultSet.getString("clienti.mail"));
				contatto.setTelefono(resultSet.getString("clienti.telefono"));
				contatto.setIndirizzo(indirizzo);
				
			}
		} catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		return contatti;
	}
	
	
	public void createIndirizzo (Connection conn, Indirizzo indirizzo)
	{
		String sql = "INSERT INTO indirizzi (via, civico, cap, comune, provincia) VALUES (?, ?, ?, ?, ?)";
		try(Connection connection = conn;
			PreparedStatement statement = connection.prepareStatement(sql))
		{
			statement.setString(1, indirizzo.getVia());
			statement.setString(2, indirizzo.getCivico());
			statement.setString(3, indirizzo.getCap());
			statement.setString(4, indirizzo.getComune());
			statement.setString(5, indirizzo.getProvincia());			
			statement.executeUpdate();
		}
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public void createContatto (Connection conn, Contatto contatto)
	{
		String sql = "INSERT INTO contatti (nome, cognome, telefono, mail, id_indirizzo) VALUES (?, ?, ?, ?,"
				+ "(SELECT MAX(id) FROM indirizzi))";
		try(Connection connection = conn;
			PreparedStatement statement = connection.prepareStatement(sql))
		{
			statement.setString(1, contatto.getNome());
			statement.setString(2, contatto.getCognome());
			statement.setString(3, contatto.getTelefono());
			statement.setString(4, contatto.getMail());
			statement.executeUpdate();
		}
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
	}
	

	
}