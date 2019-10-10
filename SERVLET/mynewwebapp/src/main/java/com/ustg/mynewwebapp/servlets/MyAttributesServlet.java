package com.ustg.mynewwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustg.mynewwebapp.servlets.dto.Employee_InfoBean;

@WebServlet("/myAttributeServlet")
public class MyAttributesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		ServletContext context = getServletContext();
		
		
		Employee_InfoBean employee_InfoBean = (Employee_InfoBean) context.getAttribute("emp");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>Employee details are - </h3>");
		out.println("id -"+employee_InfoBean.getEmp_id());
		out.println("age -"+employee_InfoBean.getEmp_age());
		out.println("name -  "+employee_InfoBean.getEmp_name());
		out.println("salary -" +employee_InfoBean.getEmp_salary());
		out.println("designation "+employee_InfoBean.getEmp_designation());
		out.println("</body>");
		out.println("</html>");
		
	}// end of doGet()
	
}// End of servlet
