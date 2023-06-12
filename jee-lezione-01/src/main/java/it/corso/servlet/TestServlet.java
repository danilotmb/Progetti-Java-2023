package it.corso.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//connessione al server 

//localhost:8080/jee-lezione-01/test?nome=Mario&cognome=Rossi&eta=21


@WebServlet("/test")
public class TestServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
			//acquisizione dati in input da parametri della richiesta
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			
			//verifica presenza e validita del parametro
			String h2 = "";
			try 
			{
				int eta = Integer.parseInt(request.getParameter("eta"));
				h2 = "<h2>Hai " + eta + " anni</h2>" ;
			} 
			catch (Exception e) 
			{
				h2 = "<h2>Non riesco a capire quanti anni hai</h2>";
			}
			
			String html = "<DOCTYPE!>"
					+ "<html>"
					+ "<head>"
					+ "<title>Pagina di test</title>"
					+ "</head>"
					+ "<body>"
					+ "<h1>Benvenuto " + nome + " " + cognome + "</h1>"
					+ h2
					+ "</body>"
					+ "</html>";
			response.setContentType("text/html");
		response.getWriter().append(html);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
