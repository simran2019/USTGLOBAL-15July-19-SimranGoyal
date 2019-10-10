package com.ustg.mynewwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletConfigServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		 String nameVal = config.getInitParameter("name");
		 
		 ServletContext context = getServletContext();
		 String val = context.getInitParameter("myParam");
		 
		 PrintWriter out = resp.getWriter();
		 
		 resp.setContentType("text/html");
		 out.println("<html>");
		 out.println("<body>");
		 
		 out.println("<h3>Name value in confi is : "+nameVal + "</h3>");
		 out.println("<h3>Name value in context is : "+val + "</h3>");
		 out.println("</body>");
		 out.println("</html>");
		
	}// end of doGet

}// end of main Class
