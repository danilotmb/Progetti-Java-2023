<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Area Utente</title>
	</head>
	
	<body>
		<h4>Il tuo carrello: </h4>
		<ul>
			<c:forEach items="${sessionScope.carrello}" var="prodotto">
				<li>
					${prodotto.descrizione} - ${prodotto.prezzo}
					<a href="utente?id=${prodotto.id}">Rimuovi</a>
				</li>
			
			</c:forEach>
		
		</ul>
	</body>
</html>