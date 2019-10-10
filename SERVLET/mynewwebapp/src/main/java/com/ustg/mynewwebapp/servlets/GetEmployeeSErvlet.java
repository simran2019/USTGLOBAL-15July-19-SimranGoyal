package com.ustg.mynewwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getEmp")
public class GetEmployeeSErvlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		if(empId == 101) {
			out.println("<h2>Employee details for empid "+empId+"-<h2>");
			out.println("Id = 101<br/>");
			out.println("name = shweta <br/>");
			out.println("salary = 678990<br/>");
			out.println("age = 23 <br/>");
			out.println("phone no = 578686098");
			
		}else {
			out.println("<h2 style=\"color:red\">REcord not found empId"+empId+"</h2>");
			
		}
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
