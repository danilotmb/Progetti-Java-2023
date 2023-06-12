package it.corso.servlet;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.corso.model.Prodotto;


@WebServlet("/utente")
public class UtenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
			{
		if(request.getAttribute("username") == null)
		{
			response.sendRedirect("login");
		}
		else {
			if(request.getParameter("id") != null)
				rimuoviProdotto(Integer.parseInt(request.getParameter("id")), request.getSession());
		request.getServletContext()
		.getRequestDispatcher("/WEB-INF/view/utente.jsp")
		.forward(request, response);
		}
			}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		
		doGet(request, response);
	}
	
	private void rimuoviProdotto(int idProdotto, HttpSession session)
	{
		List<Prodotto> carrello = (List<Prodotto>) session.getAttribute("carrello");
		carrello = carrello
				.stream()
				.filter(p -> p.getId() != idProdotto)
				.collect(Collectors.toList());
		
		//sovrascrizione
		session.setAttribute("carrello", carrello);
	}
	
	


}
