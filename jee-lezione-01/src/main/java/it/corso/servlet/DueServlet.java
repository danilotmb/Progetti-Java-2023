package it.corso.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/due")
public class DueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
	
		String utente = "Mario Rossi";
		Date oggi = new Date();
		double credito = 125.758684;
		List<String> prodotti = new ArrayList<>();
		prodotti.add("Prodotto 1");
		prodotti.add("Prodotto 2");
		prodotti.add("Prodotto 3");
		
		request.setAttribute("utente", prodotti);
		request.setAttribute("oggi", oggi);
		request.setAttribute("credito", credito);
		request.setAttribute("prodotti", prodotti);
	
		request.getServletContext()
		.getRequestDispatcher("/WEB-INF/view/due.jsp")
		.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
