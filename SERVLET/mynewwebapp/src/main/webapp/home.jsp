<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id= "bean" class = "com.ustg.mynewwebapp.servlets.dto.Employee_InfoBean" scope = "session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="right">
<a href="./delete?id=<%=bean.getEmp_id()%>">Delete</a>
</div>
<div align="right">
<a href="./logout1">LogOut</a>
</div>
<h1>Welcome <%=bean.getEmp_name()%> successfully login</h1>
</body>
</html>