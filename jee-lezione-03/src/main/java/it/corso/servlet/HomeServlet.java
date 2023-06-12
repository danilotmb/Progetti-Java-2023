package it.corso.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.corso.model.Prodotto;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//dichiarazione e istanziazione oggetto HttpSession
		HttpSession session = request.getSession();
		
		//verifico inesistenza catalogo prodotti
		if(session.getAttribute("catalogo") == null)
			creaCatalogo(session);
		
		//se il parametro id e presente significa che l'utente vuole acuistare 
		if(request.getParameter("id") != null)
		{
			compraProdotto(Integer.parseInt(request.getParameter("id")), session);
		}
		request.getServletContext()
		.getRequestDispatcher("/WEB-INF/view/home.jsp")
		.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		
		doGet(request, response);
	}
	
	
	private void creaCatalogo(HttpSession session) 
	{
		List<Prodotto> catalogo = new ArrayList<>();
		Prodotto p1 = new Prodotto();
		
		p1.setId(1);
		p1.setDescrizione("Prodotto 1");
		p1.setPrezzo(100.90);
		
		Prodotto p2 = new Prodotto();
		p2.setId(2);
		p2.setDescrizione("Prodotto 2");
		p2.setPrezzo(10.90);
		
		Prodotto p3 = new Prodotto();
		p3.setId(3);
		p3.setDescrizione("Prodotto 3");
		p3.setPrezzo(40.90);
		
		
		catalogo.add(p1);
		catalogo.add(p2);
		catalogo.add(p3);
		
		session.setAttribute("catalogo", catalogo);
	}
	
	
	private void compraProdotto(int idProdotto, HttpSession session)
	{
		//identificazione del prodotto
		List<Prodotto> catalogo = (List<Prodotto>) session.getAttribute("catalogo");
		Prodotto prodotto = null;
		for(Prodotto p : catalogo)
		{
			if(p.getId() == idProdotto)
			{
				prodotto = p;
				break;
			}
		}
		
		//capire se l'utente ha gia un carrello
		List<Prodotto> carrello = session.getAttribute("carrello") == null ?
				new ArrayList<>() : (List<Prodotto>) session.getAttribute("carrello");
		//aggiunta prodotto
		carrello.add(prodotto);
		//salvataggio o sovrascrittura carrello
		session.setAttribute("carrello", carrello);
		
	}

}
