package it.corso.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		//dichiarazione e istanziazione dell'oggetto cookie
				Cookie cookie = new Cookie("mio", "il_mio_cookie");
				
				//impostazione caratterische cookie
				cookie.setMaxAge(3600);
				cookie.setPath("/jee-lezione-02");
				
				//aggiunta del cookie tramite la response
				response.addCookie(cookie);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		
		doGet(request, response);
	}

}
