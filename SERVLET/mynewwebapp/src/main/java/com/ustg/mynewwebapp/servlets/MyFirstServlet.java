package com.ustg.mynewwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myFirstServlet")
public class MyFirstServlet extends HttpServlet {
	
	public MyFirstServlet() {
	System.out.println("instantiation");
	}
	
	@Override
	public void init() throws ServletException {
	System.out.println("init");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("service");
	}
	
	private void distroy() {
		
		System.out.println("Distroy");

	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date date = new Date();
		
		resp.setContentType("text/html");
		//resp.setHeader("refresh", "1");   // for getting the date continuously
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		
		out.println("<head>");
		out.println("<meta http-equiv=\"refresh\" content=\"1\">"); // for getting the date continiously
		out.println("</head>");
		
		out.println("<body>");
		out.println("<h2>Current system date and time<br/>");
		out.println(date); 
		out.println("/h2");
		out.println("</body>");
		out.println("</html>");
		
	}// end of doGet()

}// end of class
