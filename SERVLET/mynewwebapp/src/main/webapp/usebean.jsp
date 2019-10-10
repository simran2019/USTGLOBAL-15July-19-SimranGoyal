<%@page import="com.ustg.mynewwebapp.servlets.dto.Employee_InfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page errorPage="error.jsp" %>
    <jsp:useBean id="emp" class = "com.ustg.mynewwebapp.servlets.dto.Employee_InfoBean" scope ="application" />
    
  <%@ include file ="index.jsp" %>
    
  <%--   <%
    Employee_InfoBean ebean = (Employee_InfoBean)application.getAttribute("emp");
    %> --%>   
    <!--  18-20 line code is also same as this -->
    
 <%--    <% int i = 1/0; %> --%><!--  because of this we go to the error.jsp page --> 
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= i %>
<h1><%= emp %></h1>
<h2><%= emp.getEmp_id() %></h2>
<h2><%= emp.getEmp_name() %></h2>
</body>
</html>