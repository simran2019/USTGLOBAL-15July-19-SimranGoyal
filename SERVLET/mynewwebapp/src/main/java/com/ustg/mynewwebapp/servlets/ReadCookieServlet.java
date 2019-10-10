package com.ustg.mynewwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readcookie")
public class ReadCookieServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	Cookie[] cookies = req.getCookies();
	PrintWriter out = resp.getWriter();
	resp.setContentType("text/html");
	out.println("<html>");
	out.println("<body>");
	
	if(cookies !=null) {
	for (Cookie cookie : cookies) {
		out.println("<h2>Cookie name is = "+cookie.getName()+"</h2>");
		out.println("<h2>Cookie value = "+cookie.getValue()+"</h2>");
	}
	}else {
		out.println("<h2>cookie not found</h2>");
	}
	out.println("<body>");
	out.println("<html>");
}
}
