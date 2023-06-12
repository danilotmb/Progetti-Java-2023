package it.corso.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		
		if(request.getAttribute("username") == null)
		request.getServletContext()
		.getRequestDispatcher("/WEB-INF/view/login.jsp")
		.forward(request, response);
		
		else 
			response.sendRedirect("riservata");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		
		//costanti di controllo 
		final String USERNAME_REGISTRATO = "Danilo";
		final String PASSWORD_REGISTRATA = "1234";
		
		//acquisizione dati in input
		String unsernameInserito = request.getParameter("username");
		String passwordInserita = request.getParameter("password");
		
		if(unsernameInserito.equalsIgnoreCase(USERNAME_REGISTRATO) && 
				passwordInserita.equalsIgnoreCase(PASSWORD_REGISTRATA))
		{
			createLogCookie(unsernameInserito, response);
			response.sendRedirect("riservata");
		}
		else 
		{
			doGet(request, response);
		}
	}
	
	//metodo che crea un cookie e ci salva lo username dell'utente
	private void createLogCookie (String username, HttpServletResponse response)
	{
		Cookie cookie = new Cookie("log", username);
		cookie.setMaxAge(3600);
		cookie.setPath("/jee-lezione-02");
		response.addCookie(cookie);
		
		
		
	}

}
