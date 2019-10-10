<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./register" method="post">
		<table>

			<tr>
				<td>Emp id:</td>
				<td><br /> <input type="number" name="id" required
					placeholder="id"></td>
			</tr>

			<tr>
				<td>Emp name:</td>
				<td><br /> <input type="text" name="name" required
					placeholder="name"></td>
			</tr>

			<tr>
				<td>Emp age:</td>
				<td><br /> <input type="number" name="age" required
					placeholder="age"></td>
			</tr>

			<tr>
				<td>Emp salary:</td>
				<td><br /> <input type="number" name="salary" required
					placeholder="salary"></td>
			</tr>

			<tr>
				<td>Emp designation:</td>
				<td><br /> <input type="text" name="designation" required
					placeholder="designation"></td>
			</tr>

			<tr>
				<td>Emp password:</td>
				<td><br /> <input type="password" name="password" required
					placeholder="password"></td>
			</tr>

			<tr>
				<td colspan="2"><br /> <input type="submit" value="submit"></td>
			</tr>

			<tr>
				<td colspan="2"><br /> <input type="reset" value="reset"></td>
			</tr>
			
		</table>
	</form>

</body>
</html>