<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home Page</title>
	</head>
	<body>
			<h4>Il nostro catalogo prodotti</h4>
			<ul>
				<c:forEach items="${sessionScope.catalogo}" var="prodotto">
				
					<li>
						<a href="home?id=${prodotto.id}"}> ${prodotto.descrizione} - ${prodotto.prezzo}</a>
					</li>
					
				</c:forEach>
			
			</ul>
			
	</body>
</html>