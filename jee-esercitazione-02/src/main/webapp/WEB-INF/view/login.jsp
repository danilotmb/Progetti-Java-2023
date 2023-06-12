<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	
		<meta charset="UTF-8">
		<title>Login</title>
		
	</head>
	
	<body>
		<form action="login" method="POST"> 
			<input type="text" name="username" required>
			<br>
			<input type="password" name="password" required>
			<br>
			<input type="submit" value="Login">
		</form>
	</body>
</html>