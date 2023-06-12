<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>Pagina 1</title>
	</head>
	
	<body>
		
		<%
			String utente = "Mario Rossi";
			Date oggi = new Date();
			double credito = 125.758684;
			List<String> prodotti = new ArrayList<>();
			prodotti.add("Prodotto 1");
			prodotti.add("Prodotto 2");
			prodotti.add("Prodotto 3");
		
		
		
		%>
	
		<h1>Benvenuto in pagina uno <%=utente%></h1>
		<h2>Oggi e' il <%=oggi%></h2>
		<h3>Il tuo credito ammonta a <%=credito%></h3>
		<h4>Ecco il tuo carrello: </h4>
		<ul>
			<%
				for(String prodotto : prodotti)
				{
					
			%>
			<li><%=prodotto%></li>
			<%
				}
			%>
		
		</ul>
	
	</body>
	
</html>