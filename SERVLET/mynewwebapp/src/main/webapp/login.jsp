<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./login1" method ="post">
		<table>
			<tr>
				<td>Id:</td>
				<td><input type="number" name="id"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>

		</table>

	</form>
	<a href = "./register">Sign Up</a>
	</body>
	</html>