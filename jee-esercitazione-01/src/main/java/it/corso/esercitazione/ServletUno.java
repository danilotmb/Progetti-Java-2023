package it.corso.esercitazione;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/paginaUno")
public class ServletUno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		String html = "";
		try 
		{
			int x = Integer.parseInt(request.getParameter("numero1"));
			int y = Integer.parseInt(request.getParameter("numero2"));
			int somma = x + y;
			html = "<h1>La somma dei due numeri e': " + somma + "</h1>";
			
		}
		catch (Exception e) 
		{
			html = "<h1>Inserire dei numeri validi</h1>";
		}
		response.setContentType("text/html");
		response.getWriter().append(html);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
