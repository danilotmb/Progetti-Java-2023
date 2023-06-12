<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
	<head>
	
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
	</head>
	
	<body>
		<h1>Benvenuto in pagina due ${requestScope.utente}</h1>
		<h2>Oggi e' il <fmt:formatDate value="${requestScope.oggi}" pattern="dd-MM-yyyy"/></h2>
		<h3>
			Il tuo credito ammonta a 
			<fmt:formatNumber value="${requestScope.credito}" 
				 maxFractionDigits="2" minFractionDigits="2"
				type="currency" currencyCode="EUR" currencySymbol="€"/>
		</h3>
		<h4>Ecco il tuo carrello: </h4>
		<ul>
			<c:forEach items="${requestScope.prodotti }" var="p">
			<li>${ p }</li>		
			
			</c:forEach>
		
		
		</ul>

	</body>
	
</html>