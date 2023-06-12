package it.corso.esercitazione;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

@WebServlet("/paginaDue")
public class ServletDue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		String html = "";
		try 
		{
			int x = Integer.parseInt(request.getParameter("numero1"));
         
		

			if(x > 1) 
			{
	         for(int i = 2; i < x; i++)
	        	 
	            if(x % i == 0)
	            {
	             html = "<h1>Numero non primo</h1>";
	             break;
	             }
	            else {
	            	html = "<h1>Si tratta di un numero primo</h1>";
				}
	         
			}
			else
			{
				System.exit(1);
			}
			
		}
		catch (Exception e) 
		{
			html = "<h1>Inserisci un numero valido</h1>";
		}
		response.setContentType("text/html");
		response.getWriter().append(html);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
