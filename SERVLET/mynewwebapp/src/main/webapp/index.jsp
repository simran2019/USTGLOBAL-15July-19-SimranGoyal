<%@page import="java.util.Date"%>
<%!private int i = 100;

	public void JspInit() {
		System.out.println("Init");
	}%>
<%!public void JspDestroy() {
		System.out.println("Destroy");
	}%>

<%
	int count = 0;
%>
<% Date date = new Date();
%>

<html>
<body>
	<h2>Hello World!</h2>
	<h3>Count value = <%= count %></h3>
	<h1> Current Date and time is = <%= date %></h1>
	<div></div>
	<span></span>
</body>
</html>
