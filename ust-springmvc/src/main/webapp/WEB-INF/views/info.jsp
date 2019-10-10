<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${name}</h1>
<h1>***********</h1>
<h2><%=request.getAttribute("name") %></h2>
<h2>${dob}</h2>
<h1>${id}</h1>
<h1>Email= ${email}</h1>
<h1>Password = ${password}</h1>
<h1>id = ${id}</h1>
</body>
</html>